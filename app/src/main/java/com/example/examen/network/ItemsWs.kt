package com.example.examen.network

import com.example.examen.data.ItemRequestJson
import com.example.examen.data.Items
import com.example.examen.data.ItemsResponse
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface ItemsWs {

    @POST("getConjuntotiendasUsuario")
    @Headers("Content-Type: application/json")
    suspend fun getItems(@Body requestJson: ItemRequestJson): ItemsResponse
}