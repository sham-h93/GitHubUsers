package ir.hoseinsa.domain.user.repository

import ir.hoseinsa.domain.user.model.UserModel
import kotlinx.coroutines.flow.Flow

interface UserRepository {

    fun getUser(username: String): Flow<Result<UserModel>>

}