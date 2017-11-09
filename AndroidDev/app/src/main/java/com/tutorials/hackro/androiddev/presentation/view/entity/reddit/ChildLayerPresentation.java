package com.tutorials.hackro.androiddev.presentation.view.entity.reddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ChildLayerPresentation implements Serializable {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("data")
    @Expose
    private Data_LayerPresentation data;
    private final static long serialVersionUID = 4886063376116460124L;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Data_LayerPresentation getData() {
        return data;
    }

    public void setData(Data_LayerPresentation data) {
        this.data = data;
    }

}
