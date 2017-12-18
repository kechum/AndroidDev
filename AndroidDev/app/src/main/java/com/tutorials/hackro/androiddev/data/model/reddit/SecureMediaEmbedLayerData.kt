package com.tutorials.hackro.androiddev.data.model.reddit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SecureMediaEmbedLayerData {

    @SerializedName("content")
    @Expose
    var content: String? = null
    @SerializedName("width")
    @Expose
    var width: Int = 0
    @SerializedName("scrolling")
    @Expose
    var isScrolling: Boolean = false
    @SerializedName("media_domain_url")
    @Expose
    var mediaDomainUrl: String? = null
    @SerializedName("height")
    @Expose
    var height: Int = 0

}
