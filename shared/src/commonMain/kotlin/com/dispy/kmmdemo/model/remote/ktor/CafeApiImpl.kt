package com.dispy.kmmdemo.model.remote.ktor

import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import io.ktor.client.request.*
import io.ktor.http.*

/**
 * Created by Dispy-Yang on 2022/05/22
 *
 * @author Dispy-Yang
 * @since 2022/5/22
 */
class CafeApiImpl : CafeApi {
    override suspend fun fetchCafeFromApi(city: String): List<CafeResponseItem> {
        println("fetching CafeList from Network ")
        return client.get<List<CafeResponseItem>> {
            getCafeListHttpBuilder(city)
        }
    }

    private val client = HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
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