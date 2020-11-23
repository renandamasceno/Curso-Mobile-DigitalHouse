package com.renan.revisaoproject.listCategories.repository

import com.renan.revisaoproject.data.NetworkUtils
import retrofit2.http.GET

interface EndPointCategories {

    @GET("categories")
    suspend fun getCategories(): List<String>

    companion object{
        val endpoint: EndPointCategories by lazy{
            NetworkUtils.getRetroFitInstance().create(EndPointCategories::class.java)
        }
    }
}