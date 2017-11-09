
package com.tutorials.hackro.androiddev.data.model.reddit;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageLayerData {

    @SerializedName("source")
    @Expose
    private SourceLayerData source;
    @SerializedName("resolutions")
    @Expose
    private List<ResolutionLayerData> resolutions = null;
    @SerializedName("variants")
    @Expose
    private VariantsLayerData variants;
    @SerializedName("id")
    @Expose
    private String id;

    public SourceLayerData getSource() {
        return source;
    }

    public void setSource(SourceLayerData source) {
        this.source = source;
    }

    public List<ResolutionLayerData> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<ResolutionLayerData> resolutions) {
        this.resolutions = resolutions;
    }

    public VariantsLayerData getVariants() {
        return variants;
    }

    public void setVariants(VariantsLayerData variants) {
        this.variants = variants;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
