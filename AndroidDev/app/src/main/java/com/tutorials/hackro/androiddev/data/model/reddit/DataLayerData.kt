package com.tutorials.hackro.androiddev.data.model.reddit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DataLayerData {

    @SerializedName("modhash")
    @Expose
    var modhash: String? = null
    @SerializedName("whitelist_status")
    @Expose
    var whitelistStatus: String? = null
    @SerializedName("children")
    @Expose
    var children: List<ChildLayerData>? = null
    @SerializedName("after")
    @Expose
    var after: String? = null
    @SerializedName("before")
    @Expose
    var before: Any? = null

}
