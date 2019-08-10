package by.itacademy.pvtjune.dz.dz5

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.itacademy.myapplication.R
import kotlinx.android.synthetic.main.activity_dz5_1.*

class Dz5Sova : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz5_1)

        (sova.background as AnimationDrawable).start()
    }
}
