package by.itacademy.pvtjune.dz.dz0

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import by.itacademy.myapplication.R


class Dz0 : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dz0)

        val button = findViewById<Button>(R.id.button)
        val textView0 = findViewById<TextView>(R.id.textView0)
        val textView1 = findViewById<TextView>(R.id.textView1)

        fun exchange() {
            val tmpText = textView0.text
            val tmpColor = textView0.background
            textView0.setText(textView1.text)
            textView0.setBackground(textView1.background)
            textView1.setText(tmpText)
            textView1.setBackground(tmpColor)
        }

        button.setOnClickListener {
            exchange()
        }

        textView0.setOnClickListener {
            exchange()
        }

        textView1.setOnClickListener {
            exchange()
        }


    }

}
