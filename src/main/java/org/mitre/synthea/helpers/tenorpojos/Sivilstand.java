package org.mitre.synthea.helpers.tenorpojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sivilstand {

    @SerializedName("erGjeldende")
    @Expose
    public Boolean erGjeldende;
    @SerializedName("kilde")
    @Expose
    public String kilde;
    @SerializedName("aarsak")
    @Expose
    public String aarsak;
    @SerializedName("gyldighetstidspunkt")
    @Expose
    public String gyldighetstidspunkt;
    @SerializedName("sivilstand")
    @Expose
    public String sivilstand;
    @SerializedName("sivilstandsdato")
    @Expose
    public String sivilstandsdato;

}
