package com.hb.aparatviewer.ui.model

import com.hb.aparatviewer.domain.model.Category

data class CategoryUiModel(
    val category: Category,
    val isSelected: Boolean = false
)