package ir.hoseinsa.data.network

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import io.ktor.client.call.body
import io.ktor.client.network.sockets.ConnectTimeoutException
import io.ktor.client.plugins.ResponseException
import io.ktor.http.isSuccess
import ir.hoseinsa.data.data_sources.mapper.toRepo
import ir.hoseinsa.data.data_sources.model.UserDto
import ir.hoseinsa.data.users.model.UserRepo

class UsersPagingSource(
    private val api: GithubApi
) : PagingSource<Int, UserRepo>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, UserRepo> {
        val nextPage = params.key ?: START_PAGE
        return try {
            val response = api.getUsers(
            since = nextPage,
            perPage = params.loadSize
        )

            if(!response.status.isSuccess()) {
                return LoadResult.Error(Exception(response.status.description))
            }

            val data = response.body<List<UserDto>>()
            val usersData = data.toRepo()
            LoadResult.Page(
                data = usersData,
                prevKey = null,
                nextKey = if (data.isEmpty()) null else nextPage + 1
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        } catch (exception: ResponseException) {
            LoadResult.Error(exception)
        } catch (exception: ConnectTimeoutException) {
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, UserRepo>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    companion object {
        const val START_PAGE = 1
    }

}