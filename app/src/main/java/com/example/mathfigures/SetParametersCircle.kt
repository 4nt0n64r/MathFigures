package com.example.mathfigures

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import com.example.mathfigures.MainActivity.Companion.RADIUS
import kotlinx.android.synthetic.main.activity_set_parameters_circle.*

class SetParametersCircle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_parameters_circle)

        nextButton.setOnClickListener {
            if (!radius.text.isEmpty()){
                val intent = Intent(this,DisplayResultsCircle::class.java)
                intent.putExtra(RADIUS,radius.text.toString().toInt())
                startActivity(intent)
            }else{
                Snackbar.make(
                    constrCir,
                    R.string.enter_parameters,
                    Snackbar.LENGTH_SHORT
                )
            }
        }

    }
}
