
package com.tutorials.hackro.androiddev.domain.model.reddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MediaLayerDomain {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("oembed")
    @Expose
    private Oembed_LayerDomain oembed;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Oembed_LayerDomain getOembed() {
        return oembed;
    }

    public void setOembed(Oembed_LayerDomain oembed) {
        this.oembed = oembed;
    }

}
