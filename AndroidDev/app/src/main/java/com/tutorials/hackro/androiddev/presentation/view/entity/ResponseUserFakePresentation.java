package com.tutorials.hackro.androiddev.presentation.view.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tutorials.hackro.androiddev.presentation.view.entity.userfake.InfoPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.userfake.ResultPresentation;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hackro on 2/10/17.
 */

public class ResponseUserFakePresentation implements Serializable
{

    @SerializedName("results")
    @Expose
    private List<ResultPresentation> results = null;
    @SerializedName("info")
    @Expose
    private InfoPresentation info;
    private final static long serialVersionUID = 7000051412065908305L;

    public ResponseUserFakePresentation(List<ResultPresentation> results, InfoPresentation info) {
        this.results = results;
        this.info = info;
    }

    public ResponseUserFakePresentation() {
    }

    public List<ResultPresentation> getResults() {
        return results;
    }

    public void setResults(List<ResultPresentation> results) {
        this.results = results;
    }

    public InfoPresentation getInfo() {
        return info;
    }

    public void setInfo(InfoPresentation info) {
        this.info = info;
    }
}