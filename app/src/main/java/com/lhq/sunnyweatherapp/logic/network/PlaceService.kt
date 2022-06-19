package com.lhq.sunnyweatherapp.logic.network


import com.lhq.sunnyweatherapp.SunnyWeatherApplication
import com.lhq.sunnyweatherapp.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

internal interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}