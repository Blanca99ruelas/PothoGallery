package com.ruelas.pothogallery

 @JsonClass(generateAdapter = true)
data class GalleryItem(
    val title: String,
    val id: String,
    @Json(name = "url_s")val url: String,
)

