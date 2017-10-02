package com.tutorials.hackro.androiddev.presentation.view.entity.User;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AddressUserPresentation implements Serializable
{

    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("suite")
    @Expose
    private String suite;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("geoPresentation")
    @Expose
    private GeoPresentation geoPresentation;
    private final static long serialVersionUID = 6173595362430115683L;

    /**
     * No args constructor for use in serialization
     *
     */
    public AddressUserPresentation() {
    }

    /**
     *
     * @param geoPresentation
     * @param zipcode
     * @param street
     * @param suite
     * @param city
     */
    public AddressUserPresentation(String street, String suite, String city, String zipcode, GeoPresentation geoPresentation) {
        super();
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geoPresentation = geoPresentation;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public GeoPresentation getGeoPresentation() {
        return geoPresentation;
    }

    public void setGeoPresentation(GeoPresentation geoPresentation) {
        this.geoPresentation = geoPresentation;
    }

}