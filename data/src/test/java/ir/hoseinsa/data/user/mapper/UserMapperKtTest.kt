package ir.hoseinsa.data.user.mapper

import com.google.common.truth.Truth.assertThat
import ir.hoseinsa.data.user.model.UserDto
import ir.hoseinsa.domain.user.model.UserModel
import org.junit.Test

class UserMapperKtTest {

    @Test
    fun mappingUserDtoToDomainUserModel_isPassingTheRightData() {
        val userDto = UserDto(
            avatarUrl = "avatarUrl",
            bio = "bio",
            blog = "blog",
            company = "company",
            createdAt = "createdAt",
            email = "email",
            eventsUrl = "eventsUrl",
            followers = 10,
            followersUrl = "followersUrl",
            following = 20,
            followingUrl = "followingUrl",
            gistsUrl = "gistsUrl",
            gravatarId = "gravatarId",
            hireable = false,
            htmlUrl = "htmlUrl",
            id = 1,
            location = "location",
            login = "login",
            name = "name",
            nodeId = "nodeId",
            organizationsUrl = "organizationsUrl",
            publicGists = 3,
            publicRepos = 6,
            receivedEventsUrl = "receivedEventsUrl",
            reposUrl = "reposUrl",
            siteAdmin = true,
            starredUrl = "starredUrl",
            subscriptionsUrl = "subscriptionsUrl",
            twitterUsername = "twitterUsername",
            type = "type",
            updatedt = "updatedt",
            url = "url"

        )
        val userModelDomain = UserModel(
            avatarUrl = "avatarUrl",
            bio = "bio",
            followers = 10,
            following = 20,
            login = "login",
            name = "name"
        )

        val userDtoToDomain = userDto.toDomain()

        assertThat(userDtoToDomain.avatarUrl).isEqualTo(userModelDomain.avatarUrl)
        assertThat(userDtoToDomain.followers).isEqualTo(userModelDomain.followers)
        assertThat(userDtoToDomain.bio).isEqualTo(userModelDomain.bio)
        assertThat(userDtoToDomain.following).isEqualTo(userModelDomain.following)
        assertThat(userDtoToDomain.avatarUrl).isEqualTo(userModelDomain.avatarUrl)
        assertThat(userDtoToDomain.login).isEqualTo(userModelDomain.login)
        assertThat(userDtoToDomain.name).isEqualTo(userModelDomain.name)

    }

}