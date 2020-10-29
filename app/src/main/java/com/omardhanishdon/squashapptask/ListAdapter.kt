package com.omardhanishdon.squashapptask

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListAdapter(private val context : Context) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
       return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_videos , parent , false))
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context)
            .load(R.drawable.girl)
            .centerCrop()
            .into(holder.image);
    }

    inner class  ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var image : ImageView

        init {
            image = itemView.findViewById<ImageView>(R.id.image)
        }

    }

}