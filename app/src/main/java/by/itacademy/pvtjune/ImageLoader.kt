package by.itacademy.pvtjune

import android.widget.ImageView

fun imageLoad(imageView: ImageView, onLoadImageListener: OnLoadImageListener) {
}

fun loadImageCircle(imageView: ImageView, onLoadImageListener: OnLoadImageListener) {
}

interface OnLoadImageListener {
    fun onOk()
    fun onError()
}