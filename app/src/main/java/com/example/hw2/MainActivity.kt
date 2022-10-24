package com.example.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var foods : ArrayList<String> = arrayListOf("Hamburger","Pizza","Mexican","American", "Chinese")
    lateinit var editText : EditText
    lateinit var tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var addFoodBt : Button = findViewById(R.id.addFoodButton)
        var decideBt : Button = findViewById(R.id.decideButton)

        addFoodBt.setOnClickListener {
            if(!editText.text.isEmpty() && !foods.contains(editText.text.toString()) ){
                foods.add(editText.text.toString())
                editText.setText("")

            }
        }
        decideBt.setOnClickListener {
            tv.text = foods.random()
        }

        editText = findViewById(R.id.addNewFood)
        tv = findViewById(R.id.foodTextView)
    }



}