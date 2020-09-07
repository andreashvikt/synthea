package org.mitre.synthea.helpers.tenorpojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("ajourholdstidspunkt")
    @Expose
    public String ajourholdstidspunkt;
    @SerializedName("erGjeldende")
    @Expose
    public Boolean erGjeldende;
    @SerializedName("kilde")
    @Expose
    public String kilde;
    @SerializedName("gyldighetstidspunkt")
    @Expose
    public String gyldighetstidspunkt;
    @SerializedName("status")
    @Expose
    public String status;

}
