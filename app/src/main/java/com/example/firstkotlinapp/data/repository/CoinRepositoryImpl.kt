package com.example.firstkotlinapp.data.repository

import com.example.firstkotlinapp.data.CoinPaprikaApi
import com.example.firstkotlinapp.data.dto.CoinDto
import com.example.firstkotlinapp.domain.repository.CoinRepository

import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }
}