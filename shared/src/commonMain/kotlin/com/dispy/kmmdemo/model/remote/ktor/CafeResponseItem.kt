package com.dispy.kmmdemo.model.remote.ktor

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by Dispy-Yang on 2022/5/22.
 *
 * @author Dispy-Yang
 * @since 2022/5/22
 */
@Serializable
data class CafeResponseItem(
    val id: String,
    val address: String,
    val name: String,
    @SerialName("city") val cityName: String
)
