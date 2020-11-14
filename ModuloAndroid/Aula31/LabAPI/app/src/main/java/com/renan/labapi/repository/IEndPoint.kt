package com.renan.labapi.repository

import com.renan.labapi.model.ApiResponseModel
import com.renan.labapi.model.CharacterModel
import com.renan.labapi.model.LocationModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IEndPoint {

    @GET("character")
    fun obterPersonagens(): Call<ApiResponseModel<CharacterModel>>

    @GET("character/{id}")
    fun obterDetalhes(@Path("id") id:Int ): Call<CharacterModel>

    @GET("location")
    fun obterLocalizacao(): Call<ApiResponseModel<LocationModel>>
}