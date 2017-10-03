package com.tutorials.hackro.androiddev.data.model.userfake;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by hackro on 2/10/17.
 */

public class IdData implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("value")
    @Expose
    private Object value;
    private final static long serialVersionUID = 4485907310568781866L;

    /**
     * No args constructor for use in serialization
     *
     */
    public IdData() {
    }

    /**
     *
     * @param name
     * @param value
     */
    public IdData(String name, Object value) {
        super();
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


}
