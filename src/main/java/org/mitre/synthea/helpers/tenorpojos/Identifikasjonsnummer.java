package org.mitre.synthea.helpers.tenorpojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Identifikasjonsnummer {

    @SerializedName("ajourholdstidspunkt")
    @Expose
    public String ajourholdstidspunkt;
    @SerializedName("erGjeldende")
    @Expose
    public Boolean erGjeldende;
    @SerializedName("kilde")
    @Expose
    public String kilde;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("foedselsEllerDNummer")
    @Expose
    public String foedselsEllerDNummer;
    @SerializedName("identifikatortype")
    @Expose
    public String identifikatortype;

}
