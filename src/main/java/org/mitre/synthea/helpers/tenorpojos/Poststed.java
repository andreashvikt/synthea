package org.mitre.synthea.helpers.tenorpojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Poststed {

    @SerializedName("poststedsnavn")
    @Expose
    public String poststedsnavn;
    @SerializedName("postnummer")
    @Expose
    public String postnummer;

}
