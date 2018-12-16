package com.example.mathfigures

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mathfigures.MainActivity.Companion.A_SIDE
import com.example.mathfigures.MainActivity.Companion.B_SIDE
import com.example.mathfigures.MainActivity.Companion.C_SIDE
import com.example.mathfigures.plainFigures.Triangle
import kotlinx.android.synthetic.main.activity_display_results_triangle.*

class DisplayResultsTriangle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_results_triangle)

        val intent = intent

        val triangle = Triangle(intent.getIntExtra(A_SIDE,0),intent.getIntExtra(B_SIDE,0),intent.getIntExtra(C_SIDE,0))

        aSideDisplay.setText(getString(R.string.a_display, triangle.a))
        bSideDisplay.setText(getString(R.string.b_display, triangle.b))
        cSideDisplay.setText(getString(R.string.c_display, triangle.c))

        countPerimeterButton.setOnClickListener {
            displayPerimeter.text = triangle.countPerimeter().toString()
        }

        countSquareButton.setOnClickListener {
            displaySquare.text = triangle.countSquare().toString()
        }

    }
}
