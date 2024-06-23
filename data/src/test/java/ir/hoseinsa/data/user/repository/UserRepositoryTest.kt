package ir.hoseinsa.data.user.repository

import com.google.common.truth.Truth.assertThat
import ir.hoseinsa.domain.user.model.UserModel
import ir.hoseinsa.domain.user.repository.UserRepository
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class UserRepositoryTest {

    lateinit var userRepository: UserRepository

    @Before
    fun setUp() {
        userRepository = FakeUserRepository()
    }

    @Test
    fun getUser_emitUserIfHaveString() = runTest{
        var user: UserModel? = null
        userRepository.getUser("name").collect { result ->
            if (result.isSuccess) user = result.getOrNull()
        }

        assertThat(user).isNotNull()

    }

    @Test
    fun getUser_emitErrorWhenUserNameIsEmpty() = runTest{
        var user: UserModel? = null
        userRepository.getUser("").collect { result ->
            if (result.isSuccess) user = result.getOrNull()
        }

        assertThat(user).isNull()

    }

}