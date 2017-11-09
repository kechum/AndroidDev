package com.tutorials.hackro.androiddev.domain.model.reddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChildLayerDomain {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("data")
    @Expose
    private Data_LayerDomain data;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Data_LayerDomain getData() {
        return data;
    }

    public void setData(Data_LayerDomain data) {
        this.data = data;
    }

}
