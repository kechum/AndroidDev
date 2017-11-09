package com.tutorials.hackro.androiddev.presentation.view.entity.reddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ImageLayerPresentation implements Serializable {

    @SerializedName("source")
    @Expose
    private SourceLayerPresentation source;
    @SerializedName("resolutions")
    @Expose
    private List<ResolutionLayerPresentation> resolutions = null;
    @SerializedName("variants")
    @Expose
    private VariantsLayerPresentation variants;
    @SerializedName("id")
    @Expose
    private String id;
    private final static long serialVersionUID = -4962695179097223720L;

    public SourceLayerPresentation getSource() {
        return source;
    }

    public void setSource(SourceLayerPresentation source) {
        this.source = source;
    }

    public List<ResolutionLayerPresentation> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<ResolutionLayerPresentation> resolutions) {
        this.resolutions = resolutions;
    }

    public VariantsLayerPresentation getVariants() {
        return variants;
    }

    public void setVariants(VariantsLayerPresentation variants) {
        this.variants = variants;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
