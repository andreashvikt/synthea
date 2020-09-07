package org.mitre.synthea.helpers.tenorpojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Statsborgerskap {

    @SerializedName("erGjeldende")
    @Expose
    public Boolean erGjeldende;
    @SerializedName("kilde")
    @Expose
    public String kilde;
    @SerializedName("gyldighetstidspunkt")
    @Expose
    public String gyldighetstidspunkt;
    @SerializedName("statsborgerskap")
    @Expose
    public String statsborgerskap;
    @SerializedName("ervervsdato")
    @Expose
    public String ervervsdato;

}
