package com.tutorials.hackro.androiddev.domain.model.userfake;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by hackro on 2/10/17.
 */

public class InfoDomain implements Serializable
{

    @SerializedName("seed")
    @Expose
    private String seed;
    @SerializedName("results")
    @Expose
    private String results;
    @SerializedName("page")
    @Expose
    private String page;
    @SerializedName("version")
    @Expose
    private String version;
    private final static long serialVersionUID = -1656547464258057497L;

    /**
     * No args constructor for use in serialization
     *
     */
    public InfoDomain() {
    }


    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}