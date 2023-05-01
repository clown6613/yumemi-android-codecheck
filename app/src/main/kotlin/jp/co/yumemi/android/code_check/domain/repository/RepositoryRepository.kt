package jp.co.yumemi.android.code_check.domain.repository

import jp.co.yumemi.android.code_check.data.remote.SearchRepositoriesResultDto

interface RepositoryRepository {

    suspend fun searchRepositories(query: String): SearchRepositoriesResultDto
}
