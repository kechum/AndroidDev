package com.tutorials.hackro.androiddev.presentation.view.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tutorials.hackro.androiddev.presentation.view.entity.reddit.DataLayerPresentation;

import java.io.Serializable;

public class ResponseRedditPresentation implements Serializable {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("data")
    @Expose
    private DataLayerPresentation data;
    private final static long serialVersionUID = 3057542059734086831L;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public DataLayerPresentation getData() {
        return data;
    }

    public void setData(DataLayerPresentation data) {
        this.data = data;
    }

}
