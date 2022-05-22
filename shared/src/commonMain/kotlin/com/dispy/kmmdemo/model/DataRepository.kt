package com.dispy.kmmdemo.model

import com.dispy.kmmdemo.model.remote.ktor.CafeApi
import com.dispy.kmmdemo.model.remote.ktor.CafeApiImpl
import com.dispy.kmmdemo.model.remote.ktor.CafeResponseItem

/**
 * Created by Dispy-Yang on 2022/05/22
 *
 *
 * @author Dispy-Yang
 * @since 2022/5/22
 */
class DataRepository {
    private val ktorApi: CafeApi by lazy { CafeApiImpl() }
    suspend fun fetchCafesFromNetwork(cityName: String): List<CafeResponseItem> {
        try {
            return ktorApi.fetchCafeFromApi(cityName)
        } catch (e: Exception) {
            println(e.message)
        }
        return listOf()
    }
}