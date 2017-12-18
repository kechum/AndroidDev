package com.tutorials.hackro.androiddev.data.model.reddit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PreviewLayerData {

    @SerializedName("images")
    @Expose
    var images: List<ImageLayerData>? = null
    @SerializedName("enabled")
    @Expose
    var isEnabled: Boolean = false

}
