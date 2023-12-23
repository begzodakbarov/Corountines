package com.begzod.coroutines.retrofit

import com.begzod.coroutines.MyMoney
import retrofit2.http.GET

interface ApiService {

    @GET("json")
    suspend fun getMonies():List<MyMoney>

}