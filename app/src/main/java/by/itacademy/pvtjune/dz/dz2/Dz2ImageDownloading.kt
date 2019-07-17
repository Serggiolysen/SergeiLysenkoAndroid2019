package by.itacademy.pvtjune.dz.dz2

import android.app.Activity
import android.os.Bundle
import by.itacademy.myapplication.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_dz2_image_donloading.*

class Dz2ImageDownloading : Activity() {

    private val url = "https://upload.wikimedia.org/wikipedia/commons/b/b4/The_Sun_by_the_" +
            "Atmospheric_Imaging_Assembly_of_NASA%27s_Solar_Dynamics_Observatory_-_20100819.jpg"

//    private val toast = Toast.makeText(this, "loading error", Toast.LENGTH_SHORT)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz2_image_donloading)

        buttonDz2.setOnClickListener {
            downloadImage()
        }
    }

    fun downloadImage() {

        Glide
            .with(this)
            .load(url)
            .placeholder(R.drawable.progressbar)
            .apply(RequestOptions().circleCrop())
            .error(R.drawable.error)
            .into(imageViewDz2)

        textViewDz2.setText(url)
    }
}