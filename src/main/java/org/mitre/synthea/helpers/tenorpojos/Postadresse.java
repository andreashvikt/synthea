package org.mitre.synthea.helpers.tenorpojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Postadresse {

    @SerializedName("erGjeldende")
    @Expose
    public Boolean erGjeldende;
    @SerializedName("kilde")
    @Expose
    public String kilde;
    @SerializedName("gyldighetstidspunkt")
    @Expose
    public String gyldighetstidspunkt;
    @SerializedName("adressegradering")
    @Expose
    public String adressegradering;
    @SerializedName("postadresseIFrittFormat")
    @Expose
    public PostadresseIFrittFormat postadresseIFrittFormat;
    @SerializedName("ajourholdstidspunkt")
    @Expose
    public String ajourholdstidspunkt;

}
