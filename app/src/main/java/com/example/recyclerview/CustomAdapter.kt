package com.example.recyclerview

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val clothes: MutableList<Clothes>) :
    RecyclerView.Adapter<CustomAdapter.ClothesViewHolder>() {

    class ClothesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameClotheTV)
        val descriptionView: TextView = itemView.findViewById(R.id.descriptionClotheTV)
        val imageView: ImageView = itemView.findViewById(R.id.ImageIV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClothesViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ClothesViewHolder(itemView)
    }

    override fun getItemCount(): Int = clothes.size

    override fun onBindViewHolder(holder: ClothesViewHolder, position: Int) {
        val clothe = clothes[position]
        holder.nameTextView.text = clothe.name
        holder.descriptionView.text = clothe.discription
        holder.imageView.setImageResource(clothe.image)
    }
}

