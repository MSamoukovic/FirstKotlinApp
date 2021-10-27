package com.example.firstkotlinapp.domain.repository

import com.example.firstkotlinapp.data.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins():List<CoinDto>
}