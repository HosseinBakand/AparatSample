package com.hb.aparatviewer.core

import android.graphics.drawable.Drawable
import android.graphics.drawable.TransitionDrawable
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.hb.aparatviewer.di.GlideApp

/**
 * Set image loaded from url.
 *
 * @param url Image url to download and set as drawable.
 * @param placeholderId Drawable resource identifier to set while downloading image.
 */

@BindingAdapter("profileImageUrl", "profileImagePlaceholder")
fun ImageView.profileImageUrl(profileImageUrl: String?, profilePlaceholderId: Drawable?) {
    GlideApp.with(context)
        .load(profileImageUrl)
        .apply {
            placeholder(profilePlaceholderId)
        }
        .circleCrop()
        .into(this)
}

@BindingAdapter("imageUrl", "imagePlaceholder")
fun ImageView.imageUrl(imageUrl: String?, placeholderId: Drawable?) {
    GlideApp.with(context)
        .load(imageUrl)
        .apply {
            placeholder(placeholderId)
        }
        .into(this)
}
