package com.noks1i.movieapp.data.remote

import com.noks1i.movieapp.data.model.MovieList
import com.noks1i.movieapp.repository.WebService
import com.noks1i.movieapp.utils.Constants

class RemoteMovieDataSource(private val webService: WebService) {
    suspend fun getUpcomingMovies(): MovieList = webService.getUpcomingMovies(Constants.API_KEY)

    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovies(Constants.API_KEY)

    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(Constants.API_KEY)
}