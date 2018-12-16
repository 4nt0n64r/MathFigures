package com.example.mathfigures

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val FIGURE_CODE = "FIGURE_CODE"
        const val A_SIDE = "A_SIDE"
        const val B_SIDE = "B_SIDE"
        const val C_SIDE = "C_SIDE"
        const val D_SIDE = "D_SIDE"
        const val RADIUS = "RADIUS"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chooseParametersButton.setOnClickListener {
            val figure = spin.selectedItemPosition
            intent.putExtra(FIGURE_CODE,figure)
            when(figure){
                0->{
                    intent.putExtra(FIGURE_CODE,figure)
                    val intent = Intent(this,SetParametersTriangle::class.java)
                    startActivity(intent)
                }
                1->{
                    intent.putExtra(FIGURE_CODE,figure)
                    val intent = Intent(this,SetParametersRectangle::class.java)
                    startActivity(intent)
                }
                2->{
                    intent.putExtra(FIGURE_CODE,figure)
                    val intent = Intent(this,SetParametersCircle::class.java)
                    startActivity(intent)
                }
            }
        }

    }
}
