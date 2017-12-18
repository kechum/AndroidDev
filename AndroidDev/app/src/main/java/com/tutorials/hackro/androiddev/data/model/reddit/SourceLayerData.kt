package com.tutorials.hackro.androiddev.data.model.reddit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SourceLayerData {

    @SerializedName("url")
    @Expose
    var url: String? = null
    @SerializedName("width")
    @Expose
    var width: Int = 0
    @SerializedName("height")
    @Expose
    var height: Int = 0

}
