package com.piyush.myapplication


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.piyush.myapplication.databinding.ItemViewBinding

class ItemAdapter(private val items: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: ItemViewBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemViewBinding = DataBindingUtil.inflate(
            layoutInflater, R.layout.item_view, parent, false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.item = items[position]
        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
