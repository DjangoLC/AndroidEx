package com.example.examen

import com.example.examen.data.Items
import com.example.examen.data.ItemsResponse
import com.example.examen.network.ItemsRepository
import io.reactivex.Completable
import io.reactivex.Observable

class MainInteractorImpl(val repo: ItemsRepository) : MainContrac.MainInteractor {

    override suspend fun retrieveItems(): ItemsResponse {
            return repo.getItems()
    }


}