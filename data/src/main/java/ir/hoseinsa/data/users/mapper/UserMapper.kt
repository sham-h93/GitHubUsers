package ir.hoseinsa.data.users.mapper

import ir.hoseinsa.data.users.model.UserRepo
import ir.hoseinsa.domain.users.model.user.UserDomain

fun UserRepo.toDomain(): UserDomain = UserDomain(
    avatarUrl = avatarUrl,
    login = login
)