package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private val title = arrayOf(
        "Capítulo 1",
        "Capítulo 2",
        "Capítulo 3",
        "Capítulo 4",
        "Capítulo 5",
        "Capítulo 6",
        "Capítulo 7",
    )

    private val details = arrayOf(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    )

    private val images = intArrayOf(
        R.drawable.book,
        R.drawable.book,
        R.drawable.book,
        R.drawable.book,
        R.drawable.book,
        R.drawable.book,
        R.drawable.book

    )

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        var v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, i: Int) {
        holder.itemTitle.text = title[i]
        holder.itemDetail.text = details[i]
        holder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.item_image)
        var itemTitle: TextView = itemView.findViewById(R.id.item_title)
        var itemDetail: TextView = itemView.findViewById(R.id.item_detail)
    }
}