package com.example.rec

import android.content.ClipData
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>(){
    val items = listOf("Flour","Eggs","Sugar","Salt","Yeast")
    override fun getItemCount(): Int {
       return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.item_row, parent, false)
        return CustomViewHolder(cellForRow)

    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val items = items.get(position)
        holder?.view?.itemText?.text =items
    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

    init {
        view.setOnClickListener {

            val intent = Intent(view.context, ItemDetailActivity::class.java)
            view.context.startActivity(intent)
        }
    }
}