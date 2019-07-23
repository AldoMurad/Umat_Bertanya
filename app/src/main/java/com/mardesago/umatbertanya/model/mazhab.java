package com.mardesago.umatbertanya.model;

/**
 * Created by Febrian Reza on 28-Nov-17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class mazhab {

    @SerializedName("mazhabID")
    @Expose
    private Integer mazhabID;
    @SerializedName("immID")
    @Expose
    private Integer immID;
    @SerializedName("HeadingID")
    @Expose
    private String headingID;
    @SerializedName("isi_mazhab")
    @Expose
    private String isiMazhab;
    @SerializedName("immNama")
    @Expose
    private String immNama;
    @SerializedName("immKet")
    @Expose
    private String immKet;

    public Integer getMazhabID() {
        return mazhabID;
    }

    public void setMazhabID(Integer mazhabID) {
        this.mazhabID = mazhabID;
    }

    public Integer getImmID() {
        return immID;
    }

    public void setImmID(Integer immID) {
        this.immID = immID;
    }

    public String getHeadingID() {
        return headingID;
    }

    public void setHeadingID(String headingID) {
        this.headingID = headingID;
    }

    public String getIsiMazhab() {
        return isiMazhab;
    }

    public void setIsiMazhab(String isiMazhab) {
        this.isiMazhab = isiMazhab;
    }

    public String getImmNama() {
        return immNama;
    }

    public void setImmNama(String immNama) {
        this.immNama = immNama;
    }

    public String getImmKet() {
        return immKet;
    }

    public void setImmKet(String immKet) {
        this.immKet = immKet;
    }
}