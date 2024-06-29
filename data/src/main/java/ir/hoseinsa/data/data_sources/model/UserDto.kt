package ir.hoseinsa.data.data_sources.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    @SerialName("avatar_url")
    val avatar_url: String,
    @SerialName("login")
    val login: String,
)