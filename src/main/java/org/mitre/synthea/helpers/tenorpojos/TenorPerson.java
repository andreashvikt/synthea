package org.mitre.synthea.helpers.tenorpojos;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class TenorPerson {
    @SerializedName("identifikasjonsnummer")
    @Expose
    public List<Identifikasjonsnummer> identifikasjonsnummer = null;
    @SerializedName("status")
    @Expose
    public List<Status> status = null;
    @SerializedName("kjoenn")
    @Expose
    public List<Kjoenn> kjoenn = null;
    @SerializedName("foedsel")
    @Expose
    public List<Foedsel> foedsel = null;
    @SerializedName("familierelasjon")
    @Expose
    public List<Familierelasjon> familierelasjon = null;
    @SerializedName("sivilstand")
    @Expose
    public List<Sivilstand> sivilstand = null;
    @SerializedName("navn")
    @Expose
    public List<Navn> navn = null;
    @SerializedName("bostedsadresse")
    @Expose
    public List<Bostedsadresse> bostedsadresse = null;
    @SerializedName("preferertKontaktadresse")
    @Expose
    public List<PreferertKontaktadresse> preferertKontaktadresse = null;
    @SerializedName("postadresse")
    @Expose
    public List<Postadresse> postadresse = null;
    @SerializedName("statsborgerskap")
    @Expose
    public List<Statsborgerskap> statsborgerskap = null;

}


