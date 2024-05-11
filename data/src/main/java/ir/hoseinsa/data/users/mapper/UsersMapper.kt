package ir.hoseinsa.data.users.mapper

import ir.hoseinsa.data.users.model.UsersItemDto
import ir.hoseinsa.domain.users.model.user.UserItemModel

fun List<UsersItemDto>.toDomain(): List<UserItemModel> = map { user -> user.toDomain() }

fun UsersItemDto.toDomain(): UserItemModel = UserItemModel(
    avatarUrl = avatar_url,
    login = login
)