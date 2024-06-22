package ir.hoseinsa.data.users.mapper

import com.google.common.truth.Truth.assertThat
import ir.hoseinsa.data.users.model.UsersItemDto
import ir.hoseinsa.domain.users.model.user.UserItemModel
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

        val usersItemsToDomain = usersItemDto.toDomain()

        assertThat(usersItemsToDomain.login).isEqualTo(usersItemDomain.avatarUrl)
        assertThat(usersItemsToDomain.avatarUrl).isEqualTo(usersItemDomain.avatarUrl)

    }

}