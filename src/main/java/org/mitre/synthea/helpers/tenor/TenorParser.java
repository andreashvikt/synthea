package org.mitre.synthea.helpers.tenor;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TenorParser {

    public static ArrayList<TenorData> readFiles(Integer numberOfFiles) {
        ArrayList<TenorData> tenorPeronList = new ArrayList<TenorData>();
        File[] fileList = getFileList();

        for (File f : fileList) {
            if(tenorPeronList.size() < numberOfFiles) {
                TenorData tenorData = parseFile(f.getAbsolutePath());

                if(tenorData != null) {
                    tenorPeronList.add(tenorData);
                }
            }
        }

        return tenorPeronList;

    }

    public static TenorData parseFile(String filePath) {
        JsonParser jsonParser = new JsonParser();
        TenorData tenorData = new TenorData();

        // Init default values.
        tenorData.gender = "No gender set";
        tenorData.firstName = "Default firstname";
        tenorData.lastName = "Default lastname";
        tenorData.idnummer = "default idnummer";
        tenorData.birthDate = "NOT SET";

        try  {
            JsonElement fileElement = jsonParser.parse(new FileReader(filePath));
            JsonObject fileObject = fileElement.getAsJsonObject();

            // Get Root-Arrays.
            JsonArray idArray = fileObject.getAsJsonArray("identifikasjonsnummer");
            JsonArray genderArray = fileObject.getAsJsonArray("kjoenn");
            JsonArray birthArray = fileObject.getAsJsonArray("foedsel");
            JsonArray nameArray = fileObject.getAsJsonArray("navn");

            // Pick gjeldende elementer
            JsonElement idEl = getErGjeldende(idArray);
            JsonElement genderEl = getErGjeldende(genderArray);
            JsonElement birthEl = getErGjeldende(birthArray);
            JsonElement nameEl = getErGjeldende(nameArray);

            String firstName = nameEl.getAsJsonObject().get("fornavn").getAsString();
            String lastName = nameEl.getAsJsonObject().get("etternavn").getAsString();

            String gender = genderEl.getAsJsonObject().get("kjoenn").getAsString();
            String id = idEl.getAsJsonObject().get("foedselsEllerDNummer").getAsString();
            String birthDate = birthEl.getAsJsonObject().get("foedselsdato").getAsString();

            // ADD data from tenor;
            tenorData.firstName = firstName;
            tenorData.lastName = lastName;
            tenorData.gender = gender;
            tenorData.idnummer = id;
            tenorData.birthDate = birthDate;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return tenorData;

    }

    public static File[] getFileList() {
        Path currentDir = Paths.get(System.getProperty("user.dir" ));
        Path folderPath = Paths.get(currentDir.toString(), "src", "main", "resources", "tenor", "api30");
        File tenorFolder = new File(folderPath.toString());
        File[] fileList = tenorFolder.listFiles();
        return fileList;
    }

    private static JsonElement getErGjeldende(JsonArray array) {
        JsonElement result = null;
        for (JsonElement element : array) {
            JsonObject obj = element.getAsJsonObject();
            JsonElement ergjeldende = obj.get("erGjeldende");
            if(ergjeldende.getAsBoolean()) {
                result = element;
            }
        }
        return result;
    }

}
