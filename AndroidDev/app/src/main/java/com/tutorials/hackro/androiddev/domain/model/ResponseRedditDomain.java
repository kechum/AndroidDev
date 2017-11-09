package com.tutorials.hackro.androiddev.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tutorials.hackro.androiddev.domain.model.reddit.DataLayerDomain;

import java.io.Serializable;

public class ResponseRedditDomain implements Serializable {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("data")
    @Expose
    private DataLayerDomain data;
    private final static long serialVersionUID = 3057542059734086831L;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public DataLayerDomain getData() {
        return data;
    }

    public void setData(DataLayerDomain data) {
        this.data = data;
    }

}
