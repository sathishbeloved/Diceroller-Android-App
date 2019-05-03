package com.belovedinstudios.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceimage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"You are now in SathishBeloved's app",Toast.LENGTH_LONG).show()


        var rollbutton : Button = findViewById(R.id.roll_button)
        rollbutton.setOnClickListener {
            Toast.makeText(this,"You have pressed Roll button",Toast.LENGTH_SHORT).show()
            rolldice()
        }
        var resetbutton : Button = findViewById(R.id.reset_button)
        resetbutton.setOnClickListener {
            Toast.makeText(this,"You have pressed Reset button",Toast.LENGTH_SHORT).show()
            reset()
        }

    diceimage = findViewById(R.id.dice_image)
    }



    private fun reset() {
        diceimage.setImageResource(R.drawable.empty_dice)
    }

    private fun rolldice() {
        var randint = Random().nextInt(6) + 1
        val dicevalue = when (randint) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5

         else -> R.drawable.dice_2
        }
        diceimage.setImageResource(dicevalue)

    }


}
