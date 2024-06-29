package ir.hoseinsa.data.user.mapper

import ir.hoseinsa.data.user.model.UserDetailRepo
import ir.hoseinsa.domain.user.model.UserModel

fun UserDetailRepo.toDomain(): UserModel = UserModel(
    avatarUrl = avatarUrl,
    bio = bio,
    followers = followers,
    following = following,
    login = login,
    name = name
)