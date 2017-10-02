package com.tutorials.hackro.androiddev.presentation.view.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tutorials.hackro.androiddev.presentation.view.entity.User.AddressUserPresentation;
import com.tutorials.hackro.androiddev.presentation.view.entity.User.CompanyPresentation;

import java.io.Serializable;

public class ResponseUserPresentation implements Serializable
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
    private AddressUserPresentation address;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("companyPresentation")
    @Expose
    private CompanyPresentation companyPresentation;
    private final static long serialVersionUID = -1418793292625285012L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseUserPresentation() {
    }

    /**
     *
     * @param id
     * @param phone
     * @param username
     * @param website
     * @param address
     * @param email
     * @param companyPresentation
     * @param name
     */
    public ResponseUserPresentation(int id, String name, String username, String email, AddressUserPresentation address, String phone, String website, CompanyPresentation companyPresentation) {
        super();
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.companyPresentation = companyPresentation;
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

    public AddressUserPresentation getAddress() {
        return address;
    }

    public void setAddress(AddressUserPresentation address) {
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

    public CompanyPresentation getCompanyPresentation() {
        return companyPresentation;
    }

    public void setCompanyPresentation(CompanyPresentation companyPresentation) {
        this.companyPresentation = companyPresentation;
    }


    @Override
    public String toString() {
        return "ResponseUserPresentation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", companyPresentation=" + companyPresentation +
                '}';
    }
}
