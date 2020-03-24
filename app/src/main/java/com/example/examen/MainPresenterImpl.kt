package com.example.examen

import kotlinx.coroutines.*

class MainPresenterImpl(private val interactor: MainInteractorImpl) : MainContrac.MainPresenter {

    private var view: MainContrac.MainView? = null

    private val completableJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + completableJob)

    override fun attach(view: MainContrac.MainView) {
        this.view = view
    }

    override fun destroy() {
        view = null
    }

    override fun onFetchItems() {
        view?.showProgress()
        coroutineScope.launch {
            val values = interactor.retrieveItems()
            withContext(Dispatchers.Main){
                view?.dismissProgress()
                view?.setItems(values.items)
            }
        }
    }


}
