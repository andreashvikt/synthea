package org.mitre.synthea.helpers.tenorpojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class KontaktadresseIFrittFormat {

    @SerializedName("adresselinje")
    @Expose
    public List<String> adresselinje = null;

}
