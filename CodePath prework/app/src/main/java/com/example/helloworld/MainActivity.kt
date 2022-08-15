package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

//Handle user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Show layout from activity_main
        setContentView(R.layout.activity_main)

        // Display "Hello from {name}"
        // Tap a button to change color
        findViewById<Button>(R.id.textColorButton).setOnClickListener {
            Log.i("User", "Tapped text color button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.orange))
        }

        findViewById<Button>(R.id.backgroundColorButton).setOnClickListener {
            Log.i("User", "Tapped background color button")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.purple_200))
        }

        findViewById<Button>(R.id.changeTextButton).setOnClickListener {
            Log.i("User", "Tapped change text button")
            findViewById<TextView>(R.id.textView).setText(findViewById<EditText>(R.id.editText).getText().toString())
        }





    }
}