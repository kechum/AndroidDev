package com.tutorials.hackro.androiddev.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tutorials.hackro.androiddev.data.model.userfake.InfoData;
import com.tutorials.hackro.androiddev.data.model.userfake.ResultData;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hackro on 2/10/17.
 */

public class ResponseUserFake  implements Serializable
{

    @SerializedName("results")
    @Expose
    private List<ResultData> results = null;
    @SerializedName("info")
    @Expose
    private InfoData info;
    private final static long serialVersionUID = 7000051412065908305L;

    public ResponseUserFake(List<ResultData> results, InfoData info) {
        this.results = results;
        this.info = info;
    }

    public ResponseUserFake() {
    }

    public List<ResultData> getResults() {
        return results;
    }

    public void setResults(List<ResultData> results) {
        this.results = results;
    }

    public InfoData getInfo() {
        return info;
    }

    public void setInfo(InfoData info) {
        this.info = info;
    }
}