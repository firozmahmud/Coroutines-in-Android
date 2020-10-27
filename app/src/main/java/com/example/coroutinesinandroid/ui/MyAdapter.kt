package com.example.coroutinesinandroid.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coroutinesinandroid.R
import com.example.coroutinesinandroid.data.model.Quote
import kotlinx.android.synthetic.main.item_layout.view.*

class MyAdapter(private val quotes: List<Quote>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tvTitle.text = quotes[position].author
    }

    override fun getItemCount(): Int {
        return quotes.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}