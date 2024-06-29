package ir.hoseinsa.data.data_sources

import androidx.paging.PagingSource
import io.ktor.client.call.body
import ir.hoseinsa.data.data_sources.mapper.toRepo
import ir.hoseinsa.data.data_sources.model.UserDetailsDto
import ir.hoseinsa.data.network.GithubApi
import ir.hoseinsa.data.network.UsersPagingSource
import ir.hoseinsa.data.user.model.UserDetailRepo
import ir.hoseinsa.data.users.model.UserRepo

class GithubDataSourcesImpl(
    private val api: GithubApi
): GithubUsersDataSource {

    override fun getUsers(): PagingSource<Int, UserRepo> = UsersPagingSource(api = api)

    override suspend fun getUser(user: String): UserDetailRepo = api.getUser(user = user).body<UserDetailsDto>().toRepo()
}