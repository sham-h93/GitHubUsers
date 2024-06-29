package ir.hoseinsa.data.di

import io.ktor.client.HttpClient
import ir.hoseinsa.data.data_sources.GithubDataSourcesImpl
import ir.hoseinsa.data.data_sources.GithubUsersDataSource
import ir.hoseinsa.data.network.githubClient
import ir.hoseinsa.domain.users.repository.UsersRepository
import ir.hoseinsa.data.network.GithubApi
import ir.hoseinsa.data.users.repository.UsersRepositoryImpl
import org.koin.dsl.module

val dataModule = module {
    single<HttpClient> { githubClient() }
    single<GithubApi> { GithubApi(get()) }
    single<UsersRepository> { UsersRepositoryImpl(get()) }
    single<GithubUsersDataSource> { GithubDataSourcesImpl(get()) }
}