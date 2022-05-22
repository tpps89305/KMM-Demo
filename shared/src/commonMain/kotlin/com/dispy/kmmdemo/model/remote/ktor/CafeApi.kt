package com.dispy.kmmdemo.model.remote.ktor

/**
 * Created by Dispy-Yang on 2022/05/22
 *
 *
 * @author Dispy-Yang
 * @since 2022/5/22
 */
interface CafeApi {
    suspend fun fetchCafeFromApi(city: String): List<CafeResponseItem>
}