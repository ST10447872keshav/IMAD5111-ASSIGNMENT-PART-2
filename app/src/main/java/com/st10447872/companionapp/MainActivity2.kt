package com.st10447872.companionapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    //declare variables for each of values you are going to be using through out the task
    private lateinit var playButton: Button
    private lateinit var bathButton: Button
    private lateinit var feedButton: Button
    private lateinit var petImage: ImageView
    private lateinit var bathTextView: TextView
    private lateinit var playTextView: TextView
    private lateinit var feedTextView: TextView

    //we created an array in order to use multiple resources at the same time due the task requiring the use of drawables
    private val petImages = intArrayOf(R.drawable.happy_pet, R.drawable.feeding_pet, R.drawable.bathing_pet)

    //we created each variables for the companions emotions and set them to a value of 10.
    private var happiness = 10
    private var hunger = 10
    private var neatness = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // we now will initialize these values using the find view by id method
        playButton = findViewById(R.id.playButton)
        bathButton = findViewById(R.id.bathButton)
        feedButton = findViewById(R.id.feedButton)
        petImage = findViewById(R.id.petImage)
        bathTextView = findViewById(R.id.bathTextView)
        playTextView = findViewById(R.id.playTexyView)
        feedTextView = findViewById(R.id.feedTextView)

        // the following code is for the textviews that will be used in order for the user to see the level of hunger, happiness and neatness
        petImage.setImageResource(petImages[0])
        playTextView.text = "happiness: $happiness"
        feedTextView.text = "Hunger: $hunger"
        bathTextView.text = "neatness: $neatness"

        // inorder to use the button with the corresponding image we use the set on click listener method for the feed button
        feedButton.setOnClickListener {
            updatePetStatus(1)
        }

        // inorder to use the button we use the set on click listener method for the bath button
        bathButton.setOnClickListener {
            updatePetStatus(2)
        }

        // inorder to use the button we use the set on click listener method for the play button
        playButton.setOnClickListener {
            updatePetStatus(3)
        }
    }

    private fun updatePetStatus(action: Int) {
        // we create a seperate private fun for the pet status inorder to calculate the values for the pets satisfaction
        when (action) {
            1 -> {
                petImage.setImageResource(petImages[1])
                happiness += 5
                hunger += 10
                neatness -= 5
            }
            2 -> {
                petImage.setImageResource(petImages[2])
                happiness -= 5
                hunger -= 5
                neatness += 10
            }
            3 -> {
                petImage.setImageResource(petImages[0])
                happiness += 10
                hunger -= 5
                neatness -= 5
            }
        }

        // this code ensures that values for the code is updated according to each button
        playTextView.text = "happiness: $happiness"
        feedTextView.text = "Hunger: $hunger"
        bathTextView.text = "neatness: $neatness"
    }
}