package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private val title = arrayOf(
        "Chapter 1",
        "Chapter 2",
        "Chapter 3",
        "Chapter 4"
    )

    private val details = arrayOf(
        "Chapter 5",
        "Chapter 6",
        "Chapter 7",
        "Chapter 8"
    )

    private val images = intArrayOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground
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