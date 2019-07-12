package by.itacademy.pvtjune.dz.dz2

import android.app.Activity
import android.content.res.Resources
import android.os.Bundle
import android.widget.Toast
import by.itacademy.myapplication.R
import by.itacademy.pvtjune.loadImageCircle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_dz2_image_donloading.*

class Dz2ImageDownloading : Activity() {

    private val url = "https://www.plywerk.com/wp/wp-content/uploads/2018/09/" +
            "taking-better-pictures-with-your-phone-ck21.jpg"

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