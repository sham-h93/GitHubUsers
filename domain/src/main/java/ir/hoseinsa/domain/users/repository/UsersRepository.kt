package ir.hoseinsa.domain.users.repository

import androidx.paging.PagingData
import ir.hoseinsa.domain.users.model.UserDetail
import ir.hoseinsa.domain.users.model.User
import kotlinx.coroutines.flow.Flow

interface UsersRepository {

    fun getUsers(): Flow<PagingData<User>>

    suspend fun getUser(username: String): Result<UserDetail>

}
