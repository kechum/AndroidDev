package com.tutorials.hackro.androiddev.data.model.reddit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MediaLayerData {

    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("oembed")
    @Expose
    var oembed: Oembed_LayerData? = null

}
