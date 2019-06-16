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

        button.setOnClickListener {
            val tmpText = textView0.getText().toString()
            val tmpColor = textView0.getBackground()
            textView0.setText(textView1.getText())
            textView0.setBackground(textView1.getBackground())
            textView1.setText(tmpText)
            textView1.setBackground(tmpColor)
        }
        textView0?.setOnClickListener {
            val tmpText = textView0.getText().toString()
            val tmpColor = textView0.getBackground()
            textView0.setText(textView1.getText())
            textView0.setBackground(textView1.getBackground())
            textView1.setText(tmpText)
            textView1.setBackground(tmpColor)
        }
        textView1?.setOnClickListener {
            val tmpText = textView0.getText().toString()
            val tmpColor = textView0.getBackground()
            textView0.setText(textView1.getText())
            textView0.setBackground(textView1.getBackground())
            textView1.setText(tmpText)
            textView1.setBackground(tmpColor)
        }
    }
//    fun onClick(v:View){
//    }
}
