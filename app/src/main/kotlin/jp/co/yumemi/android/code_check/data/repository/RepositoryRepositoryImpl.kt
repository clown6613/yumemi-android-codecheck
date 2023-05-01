package jp.co.yumemi.android.code_check.data.repository

import jp.co.yumemi.android.code_check.data.remote.GitHubApi
import jp.co.yumemi.android.code_check.data.remote.SearchRepositoriesResultDto
import jp.co.yumemi.android.code_check.domain.repository.RepositoryRepository
import javax.inject.Inject

class RepositoryRepositoryImpl @Inject constructor(
    private val api: GitHubApi
) : RepositoryRepository {
    override suspend fun searchRepositories(query: String): SearchRepositoriesResultDto {
        return api.searchRepositories(query)
    }
}
