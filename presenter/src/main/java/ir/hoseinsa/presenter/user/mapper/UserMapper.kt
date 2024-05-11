package ir.hoseinsa.presenter.user.mapper

import ir.hoseinsa.domain.user.model.UserModel
import ir.hoseinsa.presenter.user.model.User

fun UserModel.toPresenter(): User = User(
    avatarUrl = avatarUrl,
    bio = bio,
    followers = followers,
    following = following,
    login = login,
    name = name
)