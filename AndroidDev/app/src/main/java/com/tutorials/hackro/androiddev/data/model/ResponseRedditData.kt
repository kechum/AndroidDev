package com.tutorials.hackro.androiddev.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.tutorials.hackro.androiddev.data.model.reddit.DataLayerData
import com.tutorials.hackro.androiddev.data.model.reddit.Data_LayerData

import java.io.Serializable

class ResponseRedditData : Serializable {
    @SerializedName("list") @Expose var list: List<Data_LayerData> = emptyList()

}
