package org.mitre.synthea.helpers.tenorpojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bostedsadresse {

    @SerializedName("ajourholdstidspunkt")
    @Expose
    public String ajourholdstidspunkt;
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
    @SerializedName("vegadresse")
    @Expose
    public Vegadresse vegadresse;
    @SerializedName("adresseIdentifikatorFraMatrikkelen")
    @Expose
    public String adresseIdentifikatorFraMatrikkelen;
    @SerializedName("adressegradering")
    @Expose
    public String adressegradering;
    @SerializedName("grunnkrets")
    @Expose
    public Integer grunnkrets;
    @SerializedName("stemmekrets")
    @Expose
    public Integer stemmekrets;
    @SerializedName("skolekrets")
    @Expose
    public Integer skolekrets;
    @SerializedName("kirkekrets")
    @Expose
    public Integer kirkekrets;
    @SerializedName("ukjentBosted")
    @Expose
    public UkjentBosted ukjentBosted;
    @SerializedName("flyttedato")
    @Expose
    public String flyttedato;

}
