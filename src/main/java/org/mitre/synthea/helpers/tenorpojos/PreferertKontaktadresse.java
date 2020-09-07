package org.mitre.synthea.helpers.tenorpojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PreferertKontaktadresse {

    @SerializedName("erGjeldende")
    @Expose
    public Boolean erGjeldende;
    @SerializedName("kilde")
    @Expose
    public String kilde;
    @SerializedName("valg")
    @Expose
    public String valg;
    @SerializedName("adressegradering")
    @Expose
    public String adressegradering;
    @SerializedName("kontaktadresseIFrittFormat")
    @Expose
    public KontaktadresseIFrittFormat kontaktadresseIFrittFormat;

}
