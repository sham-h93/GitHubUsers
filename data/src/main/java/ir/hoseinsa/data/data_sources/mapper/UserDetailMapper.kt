package ir.hoseinsa.data.data_sources.mapper

import ir.hoseinsa.data.data_sources.model.UserDetailsDto
import ir.hoseinsa.data.user.model.UserDetailRepo


fun UserDetailsDto.toRepo(): UserDetailRepo = UserDetailRepo(
    avatarUrl = avatarUrl,
    bio = bio,
    followers = followers,
    following = following,
    login = login,
    name = name
)