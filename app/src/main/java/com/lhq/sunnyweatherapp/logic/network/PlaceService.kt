package com.lhq.sunnyweatherapp.logic.network

import retrofit2.http.GET

internal interface PlaceService {
    @GET("v2/place?token=\${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(): `fun`?
}