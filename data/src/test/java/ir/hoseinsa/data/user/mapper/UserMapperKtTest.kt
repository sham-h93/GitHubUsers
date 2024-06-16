package ir.hoseinsa.data.user.mapper

import ir.hoseinsa.data.user.model.UserDto
import ir.hoseinsa.domain.user.model.UserModel
import org.junit.Assert.assertEquals
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
        assertEquals(
            "UserDto avatarUrl is the same of userModelDomain avatarUrl",
            userModelDomain.avatarUrl,
            userDtoToDomain.avatarUrl
        )

        assertEquals(
            "UserDto followers is the same of userModelDomain followers",
            userModelDomain.followers,
            userDtoToDomain.followers
        )

        assertEquals(
            "UserDto bio is the same of userModelDomain bio",
            userModelDomain.bio,
            userDtoToDomain.bio
        )

        assertEquals(
            "UserDto following is the same of userModelDomain following",
            userModelDomain.following,
            userDtoToDomain.following
        )

        assertEquals(
            "UserDto avatarUrl is the same of userModelDomain avatarUrl",
            userModelDomain.avatarUrl,
            userDtoToDomain.avatarUrl
        )

        assertEquals(
            "UserDto login is the same of userModelDomain login",
            userModelDomain.login,
            userDtoToDomain.login
        )

        assertEquals(
            "UserDto name is the same of userModelDomain name",
            userModelDomain.name,
            userDtoToDomain.name
        )


    }

}