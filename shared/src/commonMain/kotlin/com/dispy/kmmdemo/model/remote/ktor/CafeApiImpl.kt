package com.dispy.kmmdemo.model.remote.ktor

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

/**
 * Created by Dispy-Yang on 2022/05/22
 *
 * @author Dispy-Yang
 * @since 2022/5/22
 */
class CafeApiImpl : CafeApi {
    override suspend fun fetchCafeFromApi(city: String): List<CafeResponseItem> {
        println("fetching CafeList from Network ")
        return client.get("https://cafenomad.tw/api/v1.2/cafes/$city").body()
    }

    private val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
            })
        }
        install(Logging) {
            logger = object : Logger {
                override fun log(message: String) {
                    println("CafeApiImpl log: $message")
                }
            }
            level = LogLevel.INFO
        }
        install(HttpTimeout) {
            val timeout = 20000L
            connectTimeoutMillis = timeout
            requestTimeoutMillis = timeout
            socketTimeoutMillis = timeout
        }
    }

    private fun HttpRequestBuilder.getCafeListHttpBuilder(path: String) {
        url {
            if (path.isNotEmpty()) {
                takeFrom("https://cafenomad.tw/api/v1.2/cafes/$path")
            } else {
                takeFrom("https://cafenomad.tw/api/v1.2/cafes")
            }
        }
    }
}