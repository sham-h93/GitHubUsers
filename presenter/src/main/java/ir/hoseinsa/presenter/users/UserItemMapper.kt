package ir.hoseinsa.presenter.users

import ir.hoseinsa.domain.users.model.User
import ir.hoseinsa.presenter.users.model.UserItem

fun User.toPresenter(): UserItem = UserItem(
    avatarUrl = avatarUrl,
    login = login
)