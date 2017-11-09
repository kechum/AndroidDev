
package com.tutorials.hackro.androiddev.domain.model.reddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecureMediaLayerDomain {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("oembed")
    @Expose
    private OembedLayerDomain oembed;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OembedLayerDomain getOembed() {
        return oembed;
    }

    public void setOembed(OembedLayerDomain oembed) {
        this.oembed = oembed;
    }

}
