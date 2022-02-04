package com.example.happybirthday

import android.util.Log

class Dice(var sides: Int) {



    fun roll() : Int {
        val diceRange: IntRange = 1..sides
        val randomNumber: Int = diceRange.random()
        return randomNumber
//        Log.i("MainActivity","Random: ${randomNumber}")
    }
}