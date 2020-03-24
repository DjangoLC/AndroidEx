package com.example.examen

import com.example.examen.data.Items
import com.example.examen.data.ItemsResponse
import io.reactivex.Completable
import io.reactivex.Observable

interface MainContrac {

    interface MainView {
        fun setItems(items: List<Items>)

        fun showProgress()
        fun dismissProgress()
    }

    interface MainPresenter {
        fun attach(view: MainView)
        fun destroy()

        fun onFetchItems()
    }

    interface MainInteractor{
        suspend fun retrieveItems() : ItemsResponse
    }

}