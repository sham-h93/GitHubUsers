package ir.hoseinsa.data.data_sources

import androidx.paging.PagingSource
import io.ktor.client.call.body
import io.ktor.http.HttpStatusCode
import ir.hoseinsa.data.data_sources.mapper.toRepo
import ir.hoseinsa.data.data_sources.model.UserDetailsDto
import ir.hoseinsa.data.network.GithubApi
import ir.hoseinsa.data.network.UsersPagingSource
import ir.hoseinsa.data.users.model.UserDetailRepo
import ir.hoseinsa.data.users.model.UserRepo

class GithubDataSourcesImpl(
    private val api: GithubApi
) : GithubUsersDataSource {

    override fun getUsers(): PagingSource<Int, UserRepo> = UsersPagingSource(api = api)

    override suspend fun getUser(user: String): Result<UserDetailRepo> = try {
        val response = api.getUser(user)
        when (response.status) {
            HttpStatusCode.OK -> {
                val data = response.body<UserDetailsDto>()
                Result.success(data.toRepo())
            }

            else -> Result.failure(Throwable(message = response.status.description))
        }
    } catch (e: Exception) {
        e.printStackTrace()
        Result.failure(e)
    }
}