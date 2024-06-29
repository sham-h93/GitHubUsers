package ir.hoseinsa.domain.users.usecases

import androidx.paging.PagingData
import ir.hoseinsa.domain.users.model.User
import ir.hoseinsa.domain.users.repository.UsersRepository
import kotlinx.coroutines.flow.Flow

class GetUsers(private val usersRepository: UsersRepository) {

    operator fun invoke(): Flow<PagingData<User>> = usersRepository.getUsers()

}
