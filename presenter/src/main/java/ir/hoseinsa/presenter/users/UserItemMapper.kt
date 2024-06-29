package ir.hoseinsa.presenter.users

import ir.hoseinsa.domain.users.model.user.UserDomain
import ir.hoseinsa.presenter.users.model.UserItem

fun UserDomain.toPresenter(): UserItem = UserItem(
    avatarUrl = avatarUrl,
    login = login
)