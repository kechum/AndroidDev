package com.tutorials.hackro.androiddev.presentation.view.entity.userfake;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by hackro on 2/10/17.
 */

public class NamePresentation implements Serializable
{

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("first")
    @Expose
    private String first;
    @SerializedName("last")
    @Expose
    private String last;
    private final static long serialVersionUID = -5609110524512461752L;

    /**
     * No args constructor for use in serialization
     *
     */
    public NamePresentation() {
    }

    /**
     *
     * @param title
     * @param last
     * @param first
     */
    public NamePresentation(String title, String first, String last) {
        super();
        this.title = title;
        this.first = first;
        this.last = last;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

}

