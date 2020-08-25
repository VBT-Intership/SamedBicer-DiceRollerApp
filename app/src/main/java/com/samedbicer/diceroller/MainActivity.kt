package com.samedbicer.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        /*
        val countUpButton: Button = findViewById(R.id.count_button)
        countUpButton.setOnClickListener { countUp() }
         */

    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

    /*
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultTextString = resultText.text.toString()

        if (resultTextString == "Hello World!") {
            resultText.text = "1"
        } else if (resultTextString == "6") {
            // do nothing
        } else {
            resultText.text = (resultTextString.toInt() + 1).toString()
        }
    }
     */
}
