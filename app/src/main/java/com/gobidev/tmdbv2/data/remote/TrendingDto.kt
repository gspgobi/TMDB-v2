package com.gobidev.tmdbv2.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TrendingResponseDto(
    val page: Int,
    val results: List<TrendingDto>,
    @SerialName("total_pages") val totalPages: Int
)

@Serializable
data class TrendingDto(
    val id: Int,
    val title: String? = null,
    val name: String? = null,
    val overview: String? = null,
    @SerialName("poster_path") val posterPath: String? = null
)
