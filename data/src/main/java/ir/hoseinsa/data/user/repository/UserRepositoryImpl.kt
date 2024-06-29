package ir.hoseinsa.data.user.repository

import io.ktor.client.call.body
import io.ktor.http.HttpStatusCode
import ir.hoseinsa.data.user.mapper.toDomain
import ir.hoseinsa.data.user.model.UserDetailRepo
import ir.hoseinsa.domain.user.model.UserModel
import ir.hoseinsa.domain.user.repository.UserRepository
import ir.hoseinsa.data.network.GithubApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserRepositoryImpl(private val api: GithubApi) : UserRepository {

    override fun getUser(username: String): Flow<Result<UserModel>> = flow {
        try {
            val response = api.getUser(username)
            when(response.status) {
                HttpStatusCode.OK -> {
                    val data = response.body<UserDetailRepo>()
                    val user = data.toDomain()
                    emit(Result.success(user))
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            emit(Result.failure(e))
        }
    }
}
