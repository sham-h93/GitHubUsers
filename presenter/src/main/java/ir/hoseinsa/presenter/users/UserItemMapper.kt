package ir.hoseinsa.presenter.users

import ir.hoseinsa.domain.users.model.user.UserItemModel
import ir.hoseinsa.presenter.users.model.UserItem

fun UserItemModel.toPresenter(): UserItem = UserItem(
    avatarUrl = avatarUrl,
    login = login
)