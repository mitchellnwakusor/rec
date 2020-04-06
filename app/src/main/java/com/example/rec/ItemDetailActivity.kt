package com.example.rec

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class ItemDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerView.setBackgroundColor(Color.GRAY)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemDetailAdapter()
    }

    private class ItemDetailAdapter: RecyclerView.Adapter<ItemDetailViewHolder>() {
        override fun getItemCount(): Int {
            return 1
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemDetailViewHolder {
            val layoutInflater = LayoutInflater.from(parent?.context)
            val customview = layoutInflater.inflate(R.layout.description, parent, false)

            return ItemDetailViewHolder(customview)
        }

        override fun onBindViewHolder(holder: ItemDetailViewHolder, position: Int) {

        }
    }

    private class ItemDetailViewHolder(val customview: View): RecyclerView.ViewHolder(customview) {

    }
}