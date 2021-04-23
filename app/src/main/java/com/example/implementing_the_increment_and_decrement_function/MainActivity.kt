package com.example.implementing_the_increment_and_decrement_function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        addNumber()
    }

    private fun addNumber() {
        val textview  = findViewById<TextView>(R.id.numberView)
        val button1 = findViewById<Button>(R.id.addButton)
        val button2 = findViewById<Button>(R.id.subtractButton)
        var number = 0



        button1.setOnClickListener(){
            number += 1
            textview.text = number.toString()
        }
        button2.setOnClickListener(){
            if(textview.text.toString() != null && textview.text.toString().toInt() > 0){
                number -= 1
                textview.text = number.toString()
            }
        }



    }

}