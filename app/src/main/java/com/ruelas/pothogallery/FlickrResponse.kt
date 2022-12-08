package com.ruelas.pothogallery

@JsonClass(generateAdapter = true)
data class FlickrResponse(
    val photos: PhotoResponse
)