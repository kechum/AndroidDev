package com.tutorials.hackro.androiddev.domain.model.userfake;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by hackro on 2/10/17.
 */

public class ResultDomain implements Serializable
{

    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("name")
    @Expose
    private NameDomain name;
    @SerializedName("location")
    @Expose
    private LocationDomain location;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("login")
    @Expose
    private LoginDomain login;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("registered")
    @Expose
    private String registered;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("cell")
    @Expose
    private String cell;
    @SerializedName("id")
    @Expose
    private IdDomain id;
    @SerializedName("picture")
    @Expose
    private PictureDomain picture;
    @SerializedName("nat")
    @Expose
    private String nat;
    private final static long serialVersionUID = -1667505188598637064L;

    public ResultDomain() {
    }

    public ResultDomain(String gender, NameDomain name, LocationDomain location, String email, LoginDomain login, String dob, String registered, String phone, String cell, IdDomain id, PictureDomain picture, String nat) {
        this.gender = gender;
        this.name = name;
        this.location = location;
        this.email = email;
        this.login = login;
        this.dob = dob;
        this.registered = registered;
        this.phone = phone;
        this.cell = cell;
        this.id = id;
        this.picture = picture;
        this.nat = nat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public NameDomain getName() {
        return name;
    }

    public void setName(NameDomain name) {
        this.name = name;
    }

    public LocationDomain getLocation() {
        return location;
    }

    public void setLocation(LocationDomain location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LoginDomain getLogin() {
        return login;
    }

    public void setLogin(LoginDomain login) {
        this.login = login;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public IdDomain getId() {
        return id;
    }

    public void setId(IdDomain id) {
        this.id = id;
    }

    public PictureDomain getPicture() {
        return picture;
    }

    public void setPicture(PictureDomain picture) {
        this.picture = picture;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}