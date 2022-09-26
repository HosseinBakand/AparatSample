package com.hb.aparatviewer.ui.videolist

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.hb.aparatviewer.databinding.LayoutVideoItemBinding

import com.hb.aparatviewer.ui.videolist.placeholder.PlaceholderContent.PlaceholderItem

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class VideoItemRecyclerViewAdapter(
    private val values: List<PlaceholderItem>,
    private val onClickListener: ItemClickCallback
) : RecyclerView.Adapter<VideoItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutVideoItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.id
        holder.contentView.text = item.content
        holder.itemView.setOnClickListener {
            onClickListener.onClick()
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: LayoutVideoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.itemNumber
        val contentView: TextView = binding.content

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

    interface ItemClickCallback {
        fun onClick()
    }
}