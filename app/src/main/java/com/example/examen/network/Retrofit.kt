package com.example.examen.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

const val RETROFIT_URL_LOGIN = "http://www.webteam.mx/Demo/Tracker.Procesos.svc/"

object Retrofit {

    fun instanceItemsWs(): ItemsWs {
        return Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(RETROFIT_URL_LOGIN)
            .build().create(ItemsWs::class.java)
    }

}