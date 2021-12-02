package com.example.myapplication.services.network

import com.example.myapplication.ProductResponse
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface API {
    @GET("/getProduct")
    fun getBarcodeById(@Query("barcode") id:String): Deferred<ProductResponse>
}

object NetworkService {

    val api = Retrofit.Builder()
        .baseUrl("https://api.formation-android.fr")
        .addConverterFactory(
            GsonConverterFactory.create())
        .addCallAdapterFactory(
            CoroutineCallAdapterFactory()
        )
        .build()
        .create(API::class.java)
}