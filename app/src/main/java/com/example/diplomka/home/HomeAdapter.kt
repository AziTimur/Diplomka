package com.example.diplomka.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.diplomka.Caps
import com.example.diplomka.databinding.ItemHomeListBinding

class HomeAdapter(private val caps: Caps)  : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemHomeListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(caps.list[position])
    }

    override fun getItemCount(): Int =caps.list.size
    inner class ViewHolder(private val containerView: ItemHomeListBinding) :
        RecyclerView.ViewHolder(containerView.root) {
            fun onBind(caps: Caps) {
                containerView.mainImage.setImageResource(caps.image)
            }
    }

}


