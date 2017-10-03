package com.tutorials.hackro.androiddev.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tutorials.hackro.androiddev.domain.model.User.AddressUserDomain;
import com.tutorials.hackro.androiddev.domain.model.User.CompanyDomain;

import java.io.Serializable;

public class ResponseUserDomain implements Serializable
{

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("address")
    @Expose
    private AddressUserDomain address;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("companyDomain")
    @Expose
    private CompanyDomain companyDomain;
    private final static long serialVersionUID = -1418793292625285012L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseUserDomain() {
    }

    /**
     *
     * @param id
     * @param phone
     * @param username
     * @param website
     * @param address
     * @param email
     * @param companyDomain
     * @param name
     */
    public ResponseUserDomain(int id, String name, String username, String email, AddressUserDomain address, String phone, String website, CompanyDomain companyDomain) {
        super();
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.companyDomain = companyDomain;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressUserDomain getAddress() {
        return address;
    }

    public void setAddress(AddressUserDomain address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public CompanyDomain getCompanyDomain() {
        return companyDomain;
    }

    public void setCompanyDomain(CompanyDomain companyDomain) {
        this.companyDomain = companyDomain;
    }

}
