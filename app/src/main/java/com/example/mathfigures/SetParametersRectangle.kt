package com.example.mathfigures

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import com.example.mathfigures.MainActivity.Companion.A_SIDE
import com.example.mathfigures.MainActivity.Companion.B_SIDE
import com.example.mathfigures.MainActivity.Companion.C_SIDE
import com.example.mathfigures.MainActivity.Companion.D_SIDE
import kotlinx.android.synthetic.main.activity_set_parameters_rectangle.*

class SetParametersRectangle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_parameters_rectangle)

        coordinatesButton.setOnClickListener {
            sidesButon.visibility = View.VISIBLE
            coordinatesButton.visibility = View.INVISIBLE
            x1Coord.visibility = View.VISIBLE
            y1Coord.visibility = View.VISIBLE
            x2Coord.visibility = View.VISIBLE
            y2Coord.visibility = View.VISIBLE
            aSide.visibility = View.GONE
            bSide.visibility = View.GONE
        }
        sidesButon.setOnClickListener {
            sidesButon.visibility = View.INVISIBLE
            coordinatesButton.visibility = View.VISIBLE
            x1Coord.visibility = View.GONE
            y1Coord.visibility = View.GONE
            x2Coord.visibility = View.GONE
            y2Coord.visibility = View.GONE
            aSide.visibility = View.VISIBLE
            bSide.visibility = View.VISIBLE
        }
        showResultsRectangleButton.setOnClickListener {
            if (sidesButon.visibility != View.VISIBLE){
                if (!aSide.text.isEmpty() && !bSide.text.isEmpty()){
                    val intentRectangle = Intent(this,DisplayResultsRectangle::class.java)
                    intentRectangle.putExtra(A_SIDE,aSide.text.toString().toInt())
                    intentRectangle.putExtra(B_SIDE,bSide.text.toString().toInt())
                    intentRectangle.putExtra("CODE",0)
                    startActivity(intentRectangle)
                }else{
                    Snackbar.make(
                        constrRec,
                        R.string.enter_parameters,
                        Snackbar.LENGTH_SHORT
                    ).show()
                }
            }else{
                if (!x1Coord.text.isEmpty() && !y1Coord.text.isEmpty() && !x2Coord.text.isEmpty() && !y2Coord.text.isEmpty()){
                    val intentRectangle = Intent(this,DisplayResultsRectangle::class.java)
                    intentRectangle.putExtra(A_SIDE,x1Coord.text.toString().toInt())
                    intentRectangle.putExtra(B_SIDE,y1Coord.text.toString().toInt())
                    intentRectangle.putExtra(C_SIDE,x2Coord.text.toString().toInt())
                    intentRectangle.putExtra(D_SIDE,y2Coord.text.toString().toInt())
                    intentRectangle.putExtra("CODE",1)
                    startActivity(intentRectangle)
                }else{
                    Snackbar.make(
                        constrRec,
                        R.string.enter_parameters,
                        Snackbar.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}
