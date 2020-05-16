package com.aliasadi.clean.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Ali Asadi on 13/05/2020
 */
data class MovieRemote(
        @SerializedName("id")
        val id: Int,

        @SerializedName("description")
        val description: String,

        @SerializedName("image")
        val image: String,

        @SerializedName("title")
        val title: String
)