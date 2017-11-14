package com.tutorials.hackro.androiddev.data.model.reddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MediaLayerData {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("oembed")
    @Expose
    private Oembed_LayerData oembed;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Oembed_LayerData getOembed() {
        return oembed;
    }

    public void setOembed(Oembed_LayerData oembed) {
        this.oembed = oembed;
    }

}
