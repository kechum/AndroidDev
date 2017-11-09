
package com.tutorials.hackro.androiddev.domain.model.reddit;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageLayerDomain {

    @SerializedName("source")
    @Expose
    private SourceLayerDomain source;
    @SerializedName("resolutions")
    @Expose
    private List<ResolutionLayerDomain> resolutions = null;
    @SerializedName("variants")
    @Expose
    private VariantsLayerDomain variants;
    @SerializedName("id")
    @Expose
    private String id;

    public ImageLayerDomain() {
    }

    public SourceLayerDomain getSource() {
        return source;
    }

    public void setSource(SourceLayerDomain source) {
        this.source = source;
    }

    public List<ResolutionLayerDomain> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<ResolutionLayerDomain> resolutions) {
        this.resolutions = resolutions;
    }

    public VariantsLayerDomain getVariants() {
        return variants;
    }

    public void setVariants(VariantsLayerDomain variants) {
        this.variants = variants;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
