package ir.hoseinsa.domain.users.usecases

import ir.hoseinsa.domain.users.model.UserDetail
import ir.hoseinsa.domain.users.repository.UsersRepository

class GetUser(private val userRepository: UsersRepository) {

    suspend operator fun invoke(username: String): Result<UserDetail> = userRepository.getUser(username)

}