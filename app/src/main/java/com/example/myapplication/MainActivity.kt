package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.Button)
        val resultsTextView = findViewById<TextView>(R.id.textView3)
        val seekbar = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener {
          val rand = Random().nextInt(seekbar.progress)
            resultsTextView.text = rand.toString()

            // this is my application

        }


    }
}
