package ir.hoseinsa.data.users.mapper

import ir.hoseinsa.data.users.model.UserDetailRepo
import ir.hoseinsa.domain.users.model.UserDetail

fun UserDetailRepo.toDomain(): UserDetail = UserDetail(
    avatarUrl = avatarUrl,
    bio = bio,
    followers = followers,
    following = following,
    login = login,
    name = name
)