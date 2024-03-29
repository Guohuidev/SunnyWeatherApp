package com.lhq.sunnyweatherapp.logic.network


import com.lhq.sunnyweatherapp.SunnyWeatherApplication
import com.lhq.sunnyweatherapp.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    suspend fun searchPlaces(@Query("query") query: String): PlaceResponse
}