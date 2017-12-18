package com.tutorials.hackro.androiddev.data.model.reddit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MediaEmbedLayerData {

    @SerializedName("content")
    @Expose
    var content: String? = null
    @SerializedName("width")
    @Expose
    var width: Int = 0
    @SerializedName("scrolling")
    @Expose
    var isScrolling: Boolean = false
    @SerializedName("height")
    @Expose
    var height: Int = 0

}
