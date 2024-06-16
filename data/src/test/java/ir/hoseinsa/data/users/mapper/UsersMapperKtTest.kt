package ir.hoseinsa.data.users.mapper

import ir.hoseinsa.data.users.model.UsersItemDto
import ir.hoseinsa.domain.users.model.user.UserItemModel
import org.junit.Assert.*
import org.junit.Test

class UsersMapperKtTest {

    @Test
    fun mappingUsersItemDtoToDomainUsersItemModel_isPassingTheRightData() {
        val usersItemDto = UsersItemDto(
            avatar_url = "avatar_url",
            events_url = "events_url",
            followers_url = "followers_url",
            following_url = "following_url",
            gists_url = "gists_url",
            gravatar_id = "gravatar_id",
            html_url = "html_url",
            id = 0,
            login = "login",
            node_id = "node_id",
            organizations_url = "organizations_url",
            received_events_url = "received_events_url",
            repos_url = "repos_url",
            site_admin = false,
            starred_url = "starred_url",
            subscriptions_url = "subscriptions_url",
            type = "type",
            url = "url"
        )
        val usersItemDomain = UserItemModel(
            avatarUrl = "avatar_url",
            login = "login"
        )

        val userItemsToDomain = usersItemDto.toDomain()

        assertEquals(
            "UsersItemDto avatarUrl is the same of UsersItemDomain avatarUrl",
            usersItemDomain.avatarUrl,
            userItemsToDomain.avatarUrl
        )

        assertEquals(
            "UsersItemDto login is the same of UsersItemDomain login",
            usersItemDomain.login,
            userItemsToDomain.login
        )

    }

}