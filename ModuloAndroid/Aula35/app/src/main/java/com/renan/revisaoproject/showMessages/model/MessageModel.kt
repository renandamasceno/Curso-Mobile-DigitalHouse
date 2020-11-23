package com.renan.revisaoproject.showMessages.model

import com.google.gson.annotations.SerializedName

data class MessageModel (
    @SerializedName("icon_url")
    val icon: String,
    @SerializedName("value")
    val message: String
)