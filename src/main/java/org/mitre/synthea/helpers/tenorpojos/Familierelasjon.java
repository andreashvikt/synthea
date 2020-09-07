package org.mitre.synthea.helpers.tenorpojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Familierelasjon {

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
    @SerializedName("relatertPerson")
    @Expose
    public String relatertPerson;
    @SerializedName("relatertPersonsRolle")
    @Expose
    public String relatertPersonsRolle;
    @SerializedName("minRolleForPerson")
    @Expose
    public String minRolleForPerson;

}
