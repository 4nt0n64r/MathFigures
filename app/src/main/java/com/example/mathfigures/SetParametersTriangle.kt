package com.example.mathfigures

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.EditText
import com.example.mathfigures.MainActivity.Companion.A_SIDE
import com.example.mathfigures.MainActivity.Companion.B_SIDE
import com.example.mathfigures.MainActivity.Companion.C_SIDE
import kotlinx.android.synthetic.main.activity_set_parameters_triangle.*

class SetParametersTriangle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_parameters_triangle)
        val intent = intent
        val what = intent.getIntExtra(MainActivity.FIGURE_CODE,0)


        showResultTriangleButton.setOnClickListener {
            if (!sideAParam.text.isEmpty() && !sideBParam.text.isEmpty() && !sideCParam.text.isEmpty()){
                if (isTriangleExist(sideAParam,sideBParam,sideCParam)){
                    val intentTriangle = Intent(this,DisplayResultsTriangle::class.java)
                    intentTriangle.putExtra(A_SIDE,sideAParam.text.toString().toInt())
                    intentTriangle.putExtra(B_SIDE,sideBParam.text.toString().toInt())
                    intentTriangle.putExtra(C_SIDE,sideCParam.text.toString().toInt())
                    startActivity(intentTriangle)
                }
                else{
                    Snackbar.make(
                        constrTriangle,
                        R.string.triangle_not_exist,
                        Snackbar.LENGTH_SHORT
                    ).show()
                }
            }else{
                Snackbar.make(
                    constrTriangle,
                    R.string.enter_parameters,
                    Snackbar.LENGTH_SHORT
                ).show()
            }
        }
    }

    fun isTriangleExist(a: EditText, b: EditText, c: EditText):Boolean{
        val sideA = a.text.toString().toDouble()
        val sideB = b.text.toString().toDouble()
        val sideC = c.text.toString().toDouble()
        if (sideA+sideB-sideC <= 0){
            return false
        }
        else if (sideB+sideC-sideA <= 0){
            return false
        }
        else if (sideA+sideC-sideB <= 0){
            return false
        }
        else return true
    }
}