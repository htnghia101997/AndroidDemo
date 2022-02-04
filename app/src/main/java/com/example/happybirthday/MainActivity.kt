package com.example.happybirthday

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnButton: Button = findViewById(R.id.button)
        btnButton.setOnClickListener {

            onRoll ()
        }

    }

    fun onRoll (){

        val firstDice: Dice = Dice(6)
        val result: Int = firstDice.roll()

            val tvNumber: TextView = findViewById(R.id.number)
            tvNumber.text = result.toString()
        val imgNumber: ImageView = findViewById(R.id.imgDice)
//        imgNumber.setImageResource(R.drawable.dice_6)
        Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show()

        var drawable: Int = 0
        var string: String = ""

        when (result) {
            1 -> {
                drawable = R.drawable.dice_1
                string = "you win"
            }
            2 -> {
                drawable = R.drawable.dice_2
                string = "you lose"
            }
            3 -> {
                drawable = R.drawable.dice_3
                string = "you lose"
            }
            4 -> {
                drawable = R.drawable.dice_4
                string = "you lose"
            }
            5 -> {
                drawable = R.drawable.dice_5
                string = "you lose"
            }
            6 -> {
                drawable = R.drawable.dice_6
                string = "you lose"
            }
        }

        imgNumber.setImageResource(drawable)
        tvNumber.text = string

    }


}
