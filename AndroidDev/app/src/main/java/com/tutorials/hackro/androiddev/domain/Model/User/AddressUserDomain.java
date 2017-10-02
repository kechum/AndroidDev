package com.tutorials.hackro.androiddev.domain.Model.User;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AddressUserDomain implements Serializable
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
    @SerializedName("geoDomain")
    @Expose
    private GeoDomain geoDomain;
    private final static long serialVersionUID = 6173595362430115683L;

    /**
     * No args constructor for use in serialization
     *
     */
    public AddressUserDomain() {
    }

    /**
     *
     * @param geoDomain
     * @param zipcode
     * @param street
     * @param suite
     * @param city
     */
    public AddressUserDomain(String street, String suite, String city, String zipcode, GeoDomain geoDomain) {
        super();
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geoDomain = geoDomain;
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

    public GeoDomain getGeoDomain() {
        return geoDomain;
    }

    public void setGeoDomain(GeoDomain geoDomain) {
        this.geoDomain = geoDomain;
    }

}