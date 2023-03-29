package com.example.latihan2recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter (var listNews: ArrayList<ListNews>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    class ViewHolder (view : View) : RecyclerView.ViewHolder(view){
        var news = view.findViewById<TextView>(R.id.tvBerita)
        var date = view.findViewById<TextView>(R.id.tvTanggal)
        var categories = view.findViewById<TextView>(R.id.tvCategories)
        var iView = view.findViewById<ImageView>(R.id.iView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsAdapter.ViewHolder, position: Int) {
        holder.news.text = listNews[position].news
        holder.date.text = listNews[position].date.toString()
        holder.categories.text = listNews[position].categories
        holder.iView.setImageResource(listNews[position].img)


    }

    override fun getItemCount(): Int {
        return listNews.size
    }
}