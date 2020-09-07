package org.mitre.synthea.helpers.tenorpojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Foedsel {

    @SerializedName("erGjeldende")
    @Expose
    public Boolean erGjeldende;
    @SerializedName("kilde")
    @Expose
    public String kilde;
    @SerializedName("foedselsdato")
    @Expose
    public String foedselsdato;
    @SerializedName("foedselsaar")
    @Expose
    public String foedselsaar;
    @SerializedName("foedekommuneINorge")
    @Expose
    public String foedekommuneINorge;
    @SerializedName("foedeland")
    @Expose
    public String foedeland;

}
