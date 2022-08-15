package com.example.helloworld

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputMethodManager
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
            if (findViewById<EditText>(R.id.editText).getText().toString() != "") {
                findViewById<TextView>(R.id.textView).setText(findViewById<EditText>(R.id.editText).getText().toString())
            } else {
                findViewById<TextView>(R.id.textView).setText("Hello from Minh!")
            }
            val imm =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        }

        findViewById<Button>(R.id.goodbyeButton).setOnClickListener {
            Log.i("User", "Tapped goodbye button")
            findViewById<TextView>(R.id.textView).setText("Goodbye")
        }

        findViewById<Button>(R.id.resetButton).setOnClickListener {
            Log.i("User", "Tapped reset button")
            findViewById<TextView>(R.id.textView).setText("Hello from Minh")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.navy))
        }
    }
}