package com.marcus.colores

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val columnList: List<ColorColumn>) : RecyclerView.Adapter<MyViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.color_column, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return columnList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.render(columnList[position])
    }
}