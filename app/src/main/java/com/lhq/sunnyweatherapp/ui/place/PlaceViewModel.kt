package com.lhq.sunnyweatherapp.ui.place

import androidx.lifecycle.*
import com.lhq.sunnyweatherapp.logic.Repository
import com.lhq.sunnyweatherapp.logic.model.Place


class PlaceViewModel : ViewModel() {

    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }

}