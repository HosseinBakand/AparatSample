package com.hb.aparatviewer.ui.videolist

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.hb.aparatviewer.R
import com.hb.aparatviewer.databinding.LayoutVideoItemBinding
import com.hb.aparatviewer.domain.model.VideoEntity

private object MyDiffUtil : DiffUtil.ItemCallback<VideoEntity>() {
    override fun areItemsTheSame(oldItem: VideoEntity, newItem: VideoEntity) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: VideoEntity, newItem: VideoEntity) = true
}

class VideoItemRecyclerViewAdapter(
    private val onClickListener: ItemClickCallback
) : ListAdapter<VideoEntity, RecyclerView.ViewHolder>(MyDiffUtil) {

    lateinit var mbinding: LayoutVideoItemBinding
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return  itemViewHolderInflater(inflater, parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        if (holder is ItemViewHolder) setItemListener(holder, item)
    }


    inner class ItemViewHolder(binding: LayoutVideoItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val holderBinding = binding
    }

    private fun setItemListener(holder: ItemViewHolder, item: VideoEntity) {
        holder.holderBinding.videoSummary = item
        holder.itemView.tag = item
        holder.itemView.setOnClickListener {
            onClickListener.onClick(item.uid)//(item)
//            it.findNavController().navigate(R.id.action_placesFragment_to_mapFragment)
        }
    }

    private fun itemViewHolderInflater(
        inflater: LayoutInflater,
        parent: ViewGroup
    ): RecyclerView.ViewHolder {
        context = parent.context
        mbinding = DataBindingUtil.inflate(inflater, R.layout.layout_video_item, parent, false)
        return ItemViewHolder(mbinding)
    }

    interface ItemClickCallback {
        fun onClick( videoId : String)
    }
}