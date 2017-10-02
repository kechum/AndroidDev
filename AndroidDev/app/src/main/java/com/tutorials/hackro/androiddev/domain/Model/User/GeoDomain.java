package com.tutorials.hackro.androiddev.domain.Model.User;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GeoDomain implements Serializable
{

    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;
    private final static long serialVersionUID = 6994647681302699215L;

    /**
     * No args constructor for use in serialization
     *
     */
    public GeoDomain() {
    }

    /**
     *
     * @param lng
     * @param lat
     */
    public GeoDomain(String lat, String lng) {
        super();
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

}
