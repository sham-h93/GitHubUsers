package ir.hoseinsa.data.users.model

data class UserDetailRepo(
    val avatarUrl: String,
    val bio: String?,
    val followers: Int,
    val following: Int,
    val login: String,
    val name: String
)