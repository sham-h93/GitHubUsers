package ir.hoseinsa.data.data_sources

import androidx.paging.PagingSource
import ir.hoseinsa.data.user.model.UserDetailRepo
import ir.hoseinsa.data.users.model.UserRepo

interface GithubUsersDataSource {

    fun getUsers(): PagingSource<Int, UserRepo>
    
    suspend fun getUser(user: String): UserDetailRepo

}