package ir.hoseinsa.presenter.user.model

data class User(
    val avatarUrl: String,
    val bio: String?,
    val followers: Int,
    val following: Int,
    val login: String,
    val name: String
)