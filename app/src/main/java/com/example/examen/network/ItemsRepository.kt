package com.example.examen.network

import com.example.examen.data.Items
import com.example.examen.data.ItemsResponse
import io.reactivex.Completable
import io.reactivex.Observable


interface ItemsRepository {

    suspend fun getItems() : ItemsResponse
}