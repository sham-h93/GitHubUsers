package ir.hoseinsa.data.data_sources.mapper

import ir.hoseinsa.data.data_sources.model.UserDto
import ir.hoseinsa.data.users.model.UserRepo

fun List<UserDto>.toRepo(): List<UserRepo> = map { user -> user.toRepo() }

fun UserDto.toRepo(): UserRepo = UserRepo(
    avatarUrl = avatar_url,
    login = login
)