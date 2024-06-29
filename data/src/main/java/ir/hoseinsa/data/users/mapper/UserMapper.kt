package ir.hoseinsa.data.users.mapper

import ir.hoseinsa.data.users.model.UserRepo
import ir.hoseinsa.domain.users.model.User

fun UserRepo.toDomain(): User = User(
    avatarUrl = avatarUrl,
    login = login
)