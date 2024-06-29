package ir.hoseinsa.presenter.users

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import androidx.paging.map
import ir.hoseinsa.domain.users.usecases.GetUsers
import ir.hoseinsa.presenter.users.intent.UsersScreenEvent
import ir.hoseinsa.presenter.users.state.UsersState
import ir.hoseinsa.presenter.utils.ConnectionUtils.isOnline
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class UsersViewModel(private val getUsers: GetUsers) : ViewModel() {

    var state by mutableStateOf(UsersState())
        private set

    fun onEvent(event: UsersScreenEvent) = when (event) {
        is UsersScreenEvent.GetUsers -> getUsers()
    }

    private fun getUsers() {
        if (isOnline()) {
            state = state.copy(isOnline = true)
            viewModelScope.launch {
                val items = getUsers.invoke().map { pagingData ->
                    pagingData.map { userItemModel -> userItemModel.toPresenter() }
                }
                state = state.copy(
                    userItemsModel = items
                )
            }
        } else state = state.copy(
            isOnline = false
        )
    }

}