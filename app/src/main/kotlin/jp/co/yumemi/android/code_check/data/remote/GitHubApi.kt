package jp.co.yumemi.android.code_check.data.remote

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface GitHubApi {
    @Headers("Accept: application/vnd.github+json")
    @GET("search/repositories")
    suspend fun searchRepositories(@Query("q") query: String): SearchRepositoriesResultDto
}
