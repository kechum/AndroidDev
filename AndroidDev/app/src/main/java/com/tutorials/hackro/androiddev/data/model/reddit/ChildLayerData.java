package com.tutorials.hackro.androiddev.data.model.reddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChildLayerData {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("data")
    @Expose
    private Data_LayerData data;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Data_LayerData getData() {
        return data;
    }

    public void setData(Data_LayerData data) {
        this.data = data;
    }

}
