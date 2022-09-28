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
import com.hb.aparatviewer.domain.model.VideoSummaryEntity

private object MyDiffUtil : DiffUtil.ItemCallback<VideoSummaryEntity>() {
    override fun areItemsTheSame(oldItem: VideoSummaryEntity, newItem: VideoSummaryEntity) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: VideoSummaryEntity, newItem: VideoSummaryEntity) = true
}

class VideoItemRecyclerViewAdapter(
    private val onClickListener: ItemClickCallback
) : ListAdapter<VideoSummaryEntity, RecyclerView.ViewHolder>(MyDiffUtil) {

    lateinit var mbinding: LayoutVideoItemBinding
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return  itemViewHolderInflater(inflater, parent)
//        else loadingViewHolderInflater(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        if (holder is ItemViewHolder) setItemListener(holder, item)
    }

//    override fun getItemViewType(position: Int): Int {
//        val item = getItem(position)
//        return if (item.type == 0) VIEW_TYPE_ITEM
//        else VIEW_TYPE_LOADING
//    }


    inner class ItemViewHolder(binding: LayoutVideoItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val holderBinding = binding
    }

//    inner class LoadingViewHolder(loading: View) : RecyclerView.ViewHolder(loading)

    private fun setItemListener(holder: ItemViewHolder, item: VideoSummaryEntity) {
        holder.holderBinding.videoSummary = item
        holder.itemView.tag = item
        holder.itemView.setOnClickListener {
            onClickListener.onClick()//(item)
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

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//
//        return ViewHolder(
//            LayoutVideoItemBinding.inflate(
//                LayoutInflater.from(parent.context),
//                parent,
//                false
//            )
//        )
//
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val item = values[position]
//        holder.idView.text = item.id
//        holder.contentView.text = item.content
//        holder.itemView.setOnClickListener {
//            onClickListener.onClick()
//        }
//    }
//
//    override fun getItemCount(): Int = values.size
//
//    inner class ViewHolder(binding: LayoutVideoItemBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//        val idView: TextView = binding.tvVideoTitle
//        val contentView: TextView = binding.tvProfileName
//
//        override fun toString(): String {
//            return super.toString() + " '" + contentView.text + "'"
//        }
//    }

    interface ItemClickCallback {
        fun onClick()
    }
}