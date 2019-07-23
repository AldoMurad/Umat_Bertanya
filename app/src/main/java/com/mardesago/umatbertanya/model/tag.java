package com.mardesago.umatbertanya.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class tag {
    @SerializedName("tagID")
    @Expose
    private Integer tagID;
    @SerializedName("tagNama")
    @Expose
    private String tagNama;

    public Integer getTagID() {
        return tagID;
    }

    public void setTagID(Integer tagID) {
        this.tagID = tagID;
    }

    public String getTagNama() {
        return tagNama;
    }

    public void setTagNama(String tagNama) {
        this.tagNama = tagNama;
    }
}
