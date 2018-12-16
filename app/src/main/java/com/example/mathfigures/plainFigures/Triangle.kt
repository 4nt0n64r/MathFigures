package com.example.mathfigures.plainFigures

import java.lang.Math.pow
import java.math.BigDecimal
import kotlin.math.sqrt

class Triangle(val a: Int, val b: Int, val c: Int) {
    fun countPerimeter() = a+b+c
    fun countSquare():Double{
        val p = (a+b+c)/2
        return sqrt((p*(p-a)*(p-b)*(p-c)).toDouble())
    }
    val x0 = 0
    val y0 = 0
    val x1 = a
    val y1 = 0
    val x2 = pow(((c*c-b*b-a*a)/(-2*a)).toDouble(),2.toDouble())
    val y2 = sqrt(b.toDouble()*b.toDouble()-x2)
    // X0, Y0 = 0; X1=a, Y1 = 0;
    // X2 = ((c^2-b^2-a^2)/-2a)^2 ,
    // Y2 = sqrt(b^2-((c^2-b^2-a^2)/-2a)^2)
}