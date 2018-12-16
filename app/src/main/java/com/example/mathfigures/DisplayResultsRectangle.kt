package com.example.mathfigures

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mathfigures.MainActivity.Companion.A_SIDE
import com.example.mathfigures.MainActivity.Companion.B_SIDE
import com.example.mathfigures.MainActivity.Companion.C_SIDE
import com.example.mathfigures.MainActivity.Companion.D_SIDE
import com.example.mathfigures.plainFigures.Rectangle
import kotlinx.android.synthetic.main.activity_display_results_rectangle.*

class DisplayResultsRectangle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_results_rectangle)

        val intent = intent

        if (intent.getIntExtra("CODE",0) == 0){
            val h = intent.getIntExtra(A_SIDE,0)
            val w = intent.getIntExtra(B_SIDE,0)
            val rectangle = Rectangle(h,w)
            aSideDisplay.setText(getString(R.string.a_display, rectangle.height))
            bSideDisplay.setText(getString(R.string.b_display, rectangle.width))
            countPerimeterButton.setOnClickListener {
                displayPerimeter.text = rectangle.countPerimeter().toString()
            }
            countSquareButton.setOnClickListener {
                displaySquare.text  = rectangle.countSquare().toString()
            }

        }else{
            val rectangle = Rectangle(intent.getIntExtra(A_SIDE,0),intent.getIntExtra(B_SIDE,0),intent.getIntExtra(C_SIDE,0),intent.getIntExtra(D_SIDE,0))
            aSideDisplay.setText(getString(R.string.a_display, rectangle.height))
            bSideDisplay.setText(getString(R.string.b_display, rectangle.width))
            countPerimeterButton.setOnClickListener {
                displayPerimeter.text = rectangle.countPerimeter().toString()
            }
            countSquareButton.setOnClickListener {
                displaySquare.text  = rectangle.countSquare().toString()
            }
        }





    }
}
