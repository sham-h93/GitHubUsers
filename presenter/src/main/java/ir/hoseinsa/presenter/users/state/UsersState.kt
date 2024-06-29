package ir.hoseinsa.presenter.users.state

import androidx.paging.PagingData
import ir.hoseinsa.presenter.users.model.UserItem
import kotlinx.coroutines.flow.Flow

data class UsersState(
    val isOnline: Boolean = true,
    val userItemsModel: Flow<PagingData<UserItem>>? = null
)
