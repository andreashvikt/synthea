package org.mitre.synthea.helpers.tenorpojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vegadresse {

    @SerializedName("kommunenummer")
    @Expose
    public String kommunenummer;
    @SerializedName("bruksenhetsnummer")
    @Expose
    public String bruksenhetsnummer;
    @SerializedName("bruksenhetstype")
    @Expose
    public String bruksenhetstype;
    @SerializedName("adressenavn")
    @Expose
    public String adressenavn;
    @SerializedName("adressekode")
    @Expose
    public String adressekode;
    @SerializedName("poststed")
    @Expose
    public Poststed poststed;
    @SerializedName("coAdressenavn")
    @Expose
    public String coAdressenavn;

}
