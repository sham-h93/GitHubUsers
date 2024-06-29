package ir.hoseinsa.domain.users.model

data class UserDetail(
    val avatarUrl: String,
    val bio: String?,
    val followers: Int,
    val following: Int,
    val login: String,
    val name: String
)