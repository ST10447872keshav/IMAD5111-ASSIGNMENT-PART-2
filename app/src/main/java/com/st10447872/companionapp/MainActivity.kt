package com.st10447872.companionapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    //declare variables
    // the keyword lateinnit allows us to initialize a variable later on
    private lateinit var startButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //making use of the find view by id method
        //initializing the variable by getting reference from the button
        //get reference by using the ID name

        startButton = findViewById(R.id.startButton)

        startButton.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}