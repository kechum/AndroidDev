package com.tutorials.hackro.androiddev.data.model.reddit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ChildLayerData {

    @SerializedName("kind")
    @Expose
    var kind: String? = null
    @SerializedName("data")
    @Expose
    var data: Data_LayerData? = null

}
