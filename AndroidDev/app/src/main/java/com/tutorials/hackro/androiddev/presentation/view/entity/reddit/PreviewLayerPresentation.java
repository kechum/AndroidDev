package com.tutorials.hackro.androiddev.presentation.view.entity.reddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class PreviewLayerPresentation implements Serializable {

    @SerializedName("images")
    @Expose
    private List<ImageLayerPresentation> images = null;
    @SerializedName("enabled")
    @Expose
    private boolean enabled;
    private final static long serialVersionUID = 4505427769150288604L;

    public List<ImageLayerPresentation> getImages() {
        return images;
    }

    public void setImages(List<ImageLayerPresentation> images) {
        this.images = images;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
