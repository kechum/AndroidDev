package com.tutorials.hackro.androiddev.data.model.reddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecureMediaLayerData {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("oembed")
    @Expose
    private OembedLayerData oembed;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OembedLayerData getOembed() {
        return oembed;
    }

    public void setOembed(OembedLayerData oembed) {
        this.oembed = oembed;
    }

}
