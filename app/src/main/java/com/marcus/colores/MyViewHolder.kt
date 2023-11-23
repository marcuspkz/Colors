package com.marcus.colores

import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    private val column1: CardView = view.findViewById(R.id.colorColumnTemplate)
    private val text1: TextView = view.findViewById(R.id.textColumnTemplate)

    fun render(column: ColorColumn) {
        column1.setCardBackgroundColor(Color.parseColor(column.color))
        text1.text = column.text
    }
}