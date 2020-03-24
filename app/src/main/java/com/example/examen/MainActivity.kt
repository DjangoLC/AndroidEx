package com.example.examen

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examen.bd.DatabaseApp
import com.example.examen.data.Items
import com.example.examen.data.ItemsAdapter
import com.example.examen.network.ItemsRepositoryImpl
import com.example.examen.network.Retrofit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContrac.MainView {

    private lateinit var presenter: MainContrac.MainPresenter
    private lateinit var dialog: AlertDialog

    private val mAdaper: ItemsAdapter by lazy {
        ItemsAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenterImpl(
            MainInteractorImpl(
                ItemsRepositoryImpl(
                    Retrofit.instanceItemsWs(),
                    DatabaseApp.getDatabase(this).dataDao()
                )
            )
        )
        presenter.attach(this)
        setUp()
        presenter.onFetchItems()
    }

    override fun onDestroy() {
        presenter.destroy()
        super.onDestroy()
    }

    fun setUp() {

        recyclerItems.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mAdaper
        }

        dialog = AlertDialog.Builder(this)
            .setTitle(getString(R.string.progress_title))
            .setCancelable(false)
            .create()


        edtSearch.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                mAdaper.getFilter()?.filter(s.toString())
                Log.e("TAG","search by ${s.toString()}")
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
    }

    override fun setItems(items: List<Items>) {
        mAdaper.items = items
    }

    override fun showProgress() {
        dialog.show()
    }

    override fun dismissProgress() {
        dialog.dismiss()
    }
}
