package com.kalashnyk.denys.defaultproject.utils.extention

import android.graphics.drawable.Drawable
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import java.io.File

fun ImageView.loadImageByUrl(path: String?) {
    GlideApp.with(context)
            .load(path)
            .centerCrop()
            .transition(DrawableTransitionOptions.withCrossFade(300))
            .placeholder(R.drawable.ic_aub_car_icon)
            .error(R.drawable.ic_aub_car_icon)
            .priority(Priority.IMMEDIATE)
            .into(this)
}

fun ImageView.loadImage(path: String?) {
    GlideApp.with(context)
            .load(path)
            .centerCrop()
            .transition(DrawableTransitionOptions.withCrossFade(300))
            .priority(Priority.IMMEDIATE)
            .into(this)
}

fun ImageView.loadImageByUrlWithCircleCrop(path: String?) {
    GlideApp.with(context)
            .load(path)
            .circleCrop()
            .fallback(R.drawable.ic_aub_car_icon)
            .error(R.drawable.ic_aub_car_icon)
            .into(this)
}

fun ImageView.loadRoundedImage(path: String?, radius: Int) {
    GlideApp.with(context)
            .asBitmap()
            .load(path)
            .transforms(
                    CenterCrop(),
                    RoundedCornersTransformation(
                            radius = radius,
                            cornerType = RoundedCornersTransformation.CornerType.TOP)
            )
            .priority(Priority.IMMEDIATE)
            .into(this)
}


fun ImageView.loadImageFromFile(file: File?) {
    GlideApp.with(context).clear(this)
    GlideApp.with(context)
            .load(file)
            .transforms(
                    CenterCrop()
            )
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .into(this)
}

fun ImageView.loadImageFile(file: File?) {
    GlideApp.with(context).clear(this)
    GlideApp.with(context)
            .load(file)
            .transforms(
                    CenterCrop()
            )
            .transition(DrawableTransitionOptions.withCrossFade(300))
            .priority(Priority.IMMEDIATE)
            .into(this)
}

fun ImageView.loadRoundedAvatar(file: File? = null, url: String? = null) {
    GlideApp.with(context).clear(this)
    GlideApp.with(context)
            .load(file ?: url)
            .circleCrop()
            .error(R.drawable.photo_button)
            .placeholder(R.drawable.photo_button)
            .transition(DrawableTransitionOptions.withCrossFade(300))
            .into(this)
}

fun ImageView.loadDrawableCircleCrop(drawable: Drawable?) {
    GlideApp.with(context)
            .load(drawable)
            .circleCrop()
            .priority(Priority.IMMEDIATE)
            .into(this)
}

fun ImageView.loadDrawableRes(drawableRes: Int?) {
    GlideApp.with(context)
            .load(drawableRes)
            .centerCrop()
            .priority(Priority.IMMEDIATE)
            .into(this)
}

fun <TranscodeType> GlideRequest<TranscodeType>.disableDiskCache(isDiskCacheStrategyDisable: Boolean): GlideRequest<TranscodeType> {
    return if (isDiskCacheStrategyDisable) {
        diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.NONE).skipMemoryCache(true)
    } else {
        this
    }
}