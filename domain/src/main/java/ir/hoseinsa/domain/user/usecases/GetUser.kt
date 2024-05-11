package ir.hoseinsa.domain.user.usecases

import ir.hoseinsa.domain.user.model.UserModel
import ir.hoseinsa.domain.user.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class GetUser(private val userRepository: UserRepository) {

    operator fun invoke(username: String): Flow<Result<UserModel>> = userRepository.getUser(username)

}