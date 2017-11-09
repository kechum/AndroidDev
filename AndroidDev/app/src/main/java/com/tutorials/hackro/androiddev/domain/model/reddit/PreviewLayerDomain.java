
package com.tutorials.hackro.androiddev.domain.model.reddit;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PreviewLayerDomain {

    @SerializedName("images")
    @Expose
    private List<ImageLayerDomain> images = null;
    @SerializedName("enabled")
    @Expose
    private boolean enabled;

    public List<ImageLayerDomain> getImages() {
        return images;
    }

    public void setImages(List<ImageLayerDomain> images) {
        this.images = images;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
