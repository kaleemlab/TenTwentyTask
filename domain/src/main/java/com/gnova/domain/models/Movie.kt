package com.gnova.domain.models

import java.io.Serializable

data class Movie(
    val id: Int? = 0,
    val vote_average: Double? = 0.0,
    val title: String? = "",
    val release_date: String? = "",
    val backdrop_path: String? = "",
    val overview: String? = "",
    val adult: Boolean? = false,
    val genre_ids: Array<String>? = arrayOf(""),
    val poster_path: String? = ""
) : Serializable