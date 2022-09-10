package com.example.vu_knf_hello_world

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloTV : TextView = findViewById(R.id.tvHello)

        val btnOne : Button = findViewById(R.id.btnOne)

        val btnTwo : Button = findViewById(R.id.btnTwo)

        // Button 1 implementation

        btnOne.setOnClickListener {
            val todaysdate = Calendar.getInstance().time
            val dateFormatter = SimpleDateFormat("dd-MM-yyyy")
            val newString =
                "Today's date is ${dateFormatter.format(todaysdate)}"
            helloTV.text = newString
        }

        // Button 2 implementation

        var isButtonPressed = false

        btnTwo.setOnClickListener {
            if(!isButtonPressed) {
                helloTV.setTextColor(Color.MAGENTA)
                isButtonPressed = true
                btnTwo.text = getString(R.string.changePink)
            }
            else {
                helloTV.setTextColor(Color.BLACK)
                isButtonPressed = false
                btnTwo.text = getString(R.string.changeBlack)
            }
        }
    }
}