package com.hb.aparatviewer.ui.videolist

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.hb.aparatviewer.R
import com.hb.aparatviewer.databinding.LayoutCateoryItemBinding
import com.hb.aparatviewer.databinding.LayoutVideoItemBinding
import com.hb.aparatviewer.domain.model.Category
import com.hb.aparatviewer.ui.model.CategoryUiModel

private object CategoryDiffUtil : DiffUtil.ItemCallback<CategoryUiModel>() {
    override fun areItemsTheSame(oldItem: CategoryUiModel, newItem: CategoryUiModel) =
        oldItem.category.id == newItem.category.id

    override fun areContentsTheSame(oldItem: CategoryUiModel, newItem: CategoryUiModel) =
        oldItem.isSelected == newItem.isSelected
}

class CategoryItemRecyclerViewAdapter(
    private val onClickListener: ItemClickCallback
) : ListAdapter<CategoryUiModel, RecyclerView.ViewHolder>(CategoryDiffUtil) {

    lateinit var mbinding: LayoutCateoryItemBinding
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return itemViewHolderInflater(inflater, parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        if (holder is ItemViewHolder) setItemListener(holder, item)
    }

    inner class ItemViewHolder(binding: LayoutCateoryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val holderBinding = binding
    }


    private fun setItemListener(holder: ItemViewHolder, item: CategoryUiModel) {
        holder.holderBinding.category = item
        holder.itemView.tag = item
        holder.itemView.setOnClickListener {
            onClickListener.onCategoryClick(item.category)
        }
    }

    private fun itemViewHolderInflater(
        inflater: LayoutInflater,
        parent: ViewGroup
    ): RecyclerView.ViewHolder {
        context = parent.context
        mbinding = DataBindingUtil.inflate(inflater, R.layout.layout_cateory_item, parent, false)
        return ItemViewHolder(mbinding)
    }

    interface ItemClickCallback {
        fun onCategoryClick(category: Category)
    }
}