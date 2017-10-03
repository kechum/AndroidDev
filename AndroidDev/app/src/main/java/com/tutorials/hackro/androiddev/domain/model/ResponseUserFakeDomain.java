package com.tutorials.hackro.androiddev.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tutorials.hackro.androiddev.domain.model.userfake.InfoDomain;
import com.tutorials.hackro.androiddev.domain.model.userfake.ResultDomain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hackro on 2/10/17.
 */

public class ResponseUserFakeDomain implements Serializable
{

    @SerializedName("results")
    @Expose
    private List<ResultDomain> results = null;
    @SerializedName("info")
    @Expose
    private InfoDomain info;
    private final static long serialVersionUID = 7000051412065908305L;

    public ResponseUserFakeDomain(List<ResultDomain> results, InfoDomain info) {
        this.results = results;
        this.info = info;
    }

    public ResponseUserFakeDomain() {
    }

    public List<ResultDomain> getResults() {
        return results;
    }

    public void setResults(List<ResultDomain> results) {
        this.results = results;
    }

    public InfoDomain getInfo() {
        return info;
    }

    public void setInfo(InfoDomain info) {
        this.info = info;
    }
}