package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //show layout file
        setContentView(R.layout.activity_main)

        //Display customized text
        //1. Add a button
        //get a ref to a button
        findViewById<Button>(R.id.button).setOnClickListener{
            //2. Set up logic
            //3.change color of text
            Log.i("Evgeniya", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }

    }
}