package com.example.responsibaper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ItemHolder>() {
    val subjects = listOf<String>("Numbers", "Counts", "Shapes")
    val descriptions =
        listOf<String>("Let's learn the numbers", "How many is this?", "Do you know this shape?")

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_numbers = itemView.findViewById<TextView>(R.id.tv_numbers)
        val tv_numbers2 = itemView.findViewById<TextView>(R.id.tv_numbers2)
    }

    //buat masukin item ke recycler view activity main 2
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemAdapter.ItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ItemHolder(view)
    }

    override fun onBindViewHolder(holder: ItemAdapter.ItemHolder, position: Int) {
        //memasukkan data ke dalam item
        holder.tv_numbers.text = subjects[position]
        holder.tv_numbers2.text = descriptions[position]
    }

    override fun getItemCount(): Int {
        return subjects.size
    }
}