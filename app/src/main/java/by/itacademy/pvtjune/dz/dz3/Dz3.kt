package by.itacademy.pvtjune.dz.dz3

import android.app.Activity
import android.os.Bundle
import by.itacademy.myapplication.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_dz3.*

class Dz3 : Activity() {

    private val url = "https://pixelbox.ru/wp-content/uploads/2018/02/saitama_steam_avatars.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz3)
        downloadImage()

    }

    fun downloadImage() {

        Glide
            .with(this)
            .load(url)
            .apply(RequestOptions.circleCropTransform())
            .error(R.drawable.error)
            .into(dz3AvatarImage)
    }
}