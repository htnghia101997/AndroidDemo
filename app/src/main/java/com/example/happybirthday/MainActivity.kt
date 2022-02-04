package com.example.happybirthday

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnButton: Button = findViewById(R.id.button)
        btnButton.setOnClickListener {

            val firstDice: Dice = Dice(10)
            val result: Int = firstDice.roll()

            val tvNumber: TextView = findViewById(R.id.number)
            tvNumber.text = result.toString()

        }





//        firstDice.sides = 20
//        val resultChange: Int = firstDice.roll()
//        Log.i("MainActivity","Random: ${resultChange}")


    }

}
