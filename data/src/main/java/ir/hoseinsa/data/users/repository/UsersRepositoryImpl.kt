package ir.hoseinsa.data.users.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.map
import ir.hoseinsa.data.data_sources.GithubUsersDataSource
import ir.hoseinsa.domain.users.model.user.UserDomain
import ir.hoseinsa.domain.users.repository.UsersRepository
import ir.hoseinsa.data.network.GithubApi
import ir.hoseinsa.data.network.UsersPagingSource
import ir.hoseinsa.data.users.mapper.toDomain
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UsersRepositoryImpl(
    private val githubUsersDataSource: GithubUsersDataSource
) : UsersRepository {

    override fun getUsers(): Flow<PagingData<UserDomain>> =
        Pager(
            config = PagingConfig(pageSize = 20, initialLoadSize = 30),
            pagingSourceFactory = { githubUsersDataSource.getUsers() }
        ).flow.map { data -> data.map { it.toDomain() } }

}