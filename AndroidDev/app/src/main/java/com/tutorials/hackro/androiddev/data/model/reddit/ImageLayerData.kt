package com.tutorials.hackro.androiddev.data.model.reddit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ImageLayerData {

    @SerializedName("source")
    @Expose
    var source: SourceLayerData? = null
    @SerializedName("resolutions")
    @Expose
    var resolutions: List<ResolutionLayerData>? = null
    @SerializedName("variants")
    @Expose
    var variants: VariantsLayerData? = null
    @SerializedName("id")
    @Expose
    var id: String? = null

}
