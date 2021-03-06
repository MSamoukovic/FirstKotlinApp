package com.example.firstkotlinapp.data

import com.example.firstkotlinapp.data.dto.CoinDto
import retrofit2.http.GET

interface CoinPaprikaApi {

    @GET("v1/coins")
    suspend fun getCoins() : List<CoinDto>
}