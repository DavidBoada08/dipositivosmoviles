package com.ramos.myapplication.data.network.endpoints

import retrofit2.http.GET
import retrofit2.http.Query

interface NewsEndpoint {

    @GET("top")
    suspend fun getAllTopNews(
        @Query("api_token") apiToken: String,
        @Query("locale") locale: String,
        @Query("limit") limit: Int
    )
}