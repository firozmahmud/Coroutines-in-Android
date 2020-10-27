package com.example.coroutinesinandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coroutinesinandroid.R
import com.example.coroutinesinandroid.data.model.Quote
import com.example.coroutinesinandroid.data.network.MyApi
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        CoroutineScope(Dispatchers.Main).launch {
            rvRecyclerView.adapter = getDataFromNetwork()?.let { MyAdapter(it) }
        }
    }


    private suspend fun getDataFromNetwork(): List<Quote>? {
        return withContext(Dispatchers.IO) {
            MyApi.invoke().getMovies().body()?.quotes
        }
    }
}