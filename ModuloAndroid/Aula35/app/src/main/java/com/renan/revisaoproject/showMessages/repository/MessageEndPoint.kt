package com.renan.revisaoproject.showMessages.repository

import com.renan.revisaoproject.data.NetworkUtils
import com.renan.revisaoproject.showMessages.model.MessageModel
import retrofit2.http.GET
import retrofit2.http.Query

interface MessageEndPoint {

    @GET("random")
    suspend fun getMessage(@Query("category") category: String): MessageModel

    companion object {
        val endpointMessage: MessageEndPoint by lazy {
            NetworkUtils.getRetroFitInstance().create(MessageEndPoint::class.java)
        }
    }
}