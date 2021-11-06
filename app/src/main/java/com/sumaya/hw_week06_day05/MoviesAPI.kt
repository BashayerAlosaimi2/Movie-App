package com.sumaya.hw_week06_day05

import com.sumaya.hw_week06_day05.MoviesData
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesAPI {
    //we should implement here the four CRUD functions for REST
    @GET("https://api.themoviedb.org/3/movie/popular?api_key=3018c5d682f9a8f4bae801594f89d1e9&language=en-US&page=1")
    suspend fun fetchMovies(): MoviesData

    @GET("https://api.themoviedb.org/3/search/movie?api_key=3018c5d682f9a8f4bae801594f89d1e9&language=en-US&page=1&include_adult=false")
    suspend fun searchMovies(@Query("query") searchKey:String ): MoviesData
}