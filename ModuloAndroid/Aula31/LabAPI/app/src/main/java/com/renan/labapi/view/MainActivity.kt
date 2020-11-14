package com.renan.labapi.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.renan.labapi.NetworkUtils
import com.renan.labapi.R
import com.renan.labapi.model.ApiResponseModel
import com.renan.labapi.model.CharacterModel
import com.renan.labapi.model.LocationModel
import com.renan.labapi.repository.IEndPoint
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // somente para testes

        httpClient = NetworkUtils.getRetroFitInstance(BASE_URL)
        obterPersonagens()


    }

    fun obterPersonagens() {
        var endpoint = httpClient.create(IEndPoint::class.java)

        endpoint.obterLocalizacao().enqueue(object: Callback<ApiResponseModel<LocationModel>>{
            override fun onResponse(
                call: Call<ApiResponseModel<LocationModel>>,
                response: Response<ApiResponseModel<LocationModel>>
            ) {
                val resultado = response.body()
                Toast.makeText(this@MainActivity,resultado!!.results[0].dimension, Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(call: Call<ApiResponseModel<LocationModel>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }


    companion object{
        const val BASE_URL = "https://rickandmortyapi.com/api/"
        lateinit var httpClient:Retrofit
    }
}