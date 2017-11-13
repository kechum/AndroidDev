package com.tutorials.hackro.androiddev.data.model.reddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecureMediaEmbedLayerData {

    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("width")
    @Expose
    private int width;
    @SerializedName("scrolling")
    @Expose
    private boolean scrolling;
    @SerializedName("media_domain_url")
    @Expose
    private String mediaDomainUrl;
    @SerializedName("height")
    @Expose
    private int height;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isScrolling() {
        return scrolling;
    }

    public void setScrolling(boolean scrolling) {
        this.scrolling = scrolling;
    }

    public String getMediaDomainUrl() {
        return mediaDomainUrl;
    }

    public void setMediaDomainUrl(String mediaDomainUrl) {
        this.mediaDomainUrl = mediaDomainUrl;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
