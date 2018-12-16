package com.example.mathfigures.plainFigures

import java.lang.Math.pow

class Circle(val radius:Int) {
    fun countPerimeter() = radius*3.14*2
    fun countSquare() = radius*pow(3.14,2.toDouble())
}