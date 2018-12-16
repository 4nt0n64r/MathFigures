package com.example.mathfigures

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mathfigures.MainActivity.Companion.RADIUS
import com.example.mathfigures.plainFigures.Circle
import kotlinx.android.synthetic.main.activity_display_results_circle.*

class DisplayResultsCircle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_results_circle)

        intent = intent
        val circle = Circle(intent.getIntExtra(RADIUS,0))

        displayRadius.setText(getString(R.string.r_display, circle.radius))

        countSquareButton.setOnClickListener {
            displaySquare.text = circle.countSquare().toString()
        }

        countLengthButton.setOnClickListener {
            displayLength.text = circle.countPerimeter().toString()
        }
    }
}
