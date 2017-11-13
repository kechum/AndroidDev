package com.tutorials.hackro.androiddev.data.model.reddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PreviewLayerData {

    @SerializedName("images")
    @Expose
    private List<ImageLayerData> images = null;
    @SerializedName("enabled")
    @Expose
    private boolean enabled;

    public List<ImageLayerData> getImages() {
        return images;
    }

    public void setImages(List<ImageLayerData> images) {
        this.images = images;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
