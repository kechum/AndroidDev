package com.tutorials.hackro.androiddev.data.model.reddit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Oembed_LayerData {

    @SerializedName("provider_url")
    @Expose
    var providerUrl: String? = null
    @SerializedName("version")
    @Expose
    var version: String? = null
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("author_name")
    @Expose
    var authorName: String? = null
    @SerializedName("height")
    @Expose
    var height: Int = 0
    @SerializedName("width")
    @Expose
    var width: Int = 0
    @SerializedName("html")
    @Expose
    var html: String? = null
    @SerializedName("thumbnail_width")
    @Expose
    var thumbnailWidth: Int = 0
    @SerializedName("provider_name")
    @Expose
    var providerName: String? = null
    @SerializedName("thumbnail_url")
    @Expose
    var thumbnailUrl: String? = null
    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("thumbnail_height")
    @Expose
    var thumbnailHeight: Int = 0
    @SerializedName("author_url")
    @Expose
    var authorUrl: String? = null

}
