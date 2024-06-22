package ir.hoseinsa.data.user.repository

import ir.hoseinsa.domain.user.model.UserModel
import ir.hoseinsa.domain.user.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FakeUserRepository: UserRepository {

    val user = UserModel(
        avatarUrl = "avatarUrl",
        bio = "bio",
        followers = 10,
        following = 5,
        login = "login",
        name = "name"
    )

    override fun getUser(username: String): Flow<Result<UserModel>> = flow {
        if (username.isNotEmpty() && username != user.name) {
            emit(Result.failure(Throwable("User not found")))
        }
        if (username.isNotEmpty() && username == user.name) {
            emit(Result.success(user))
        }
    }

}