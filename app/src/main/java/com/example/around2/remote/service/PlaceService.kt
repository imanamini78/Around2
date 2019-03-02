package com.example.around2.remote.service

import com.example.around2.remote.NetworkManager
import com.example.around2.remote.model.FeaturedPlacesResponseDto
import com.google.gson.Gson

class PlaceService(private val networkManager: NetworkManager){
    fun getFeaturedPlacesResponse() : FeaturedPlacesResponseDto{
        var rawData = networkManager.get(URL_FEATURED)
        return Gson().fromJson(rawData,FeaturedPlacesResponseDto::class.java)

    }


    companion object {
        const val URL_FEATURED = "https://restapis.xyz/around-me/v1/featured"
    }
}

