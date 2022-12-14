package com.ruelas.pothogallery.api

import com.ruelas.pothogallery.FlickrResponse

private const val API_KEY = "yourApiKeyHere"

import retrofit2.http.GET

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}