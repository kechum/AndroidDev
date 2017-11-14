package com.tutorials.hackro.androiddev.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tutorials.hackro.androiddev.data.model.reddit.DataLayerData;

import java.io.Serializable;

public class ResponseRedditData implements Serializable {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("data")
    @Expose
    private DataLayerData data;
    private final static long serialVersionUID = 3057542059734086831L;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public DataLayerData getData() {
        return data;
    }

    public void setData(DataLayerData data) {
        this.data = data;
    }

}
