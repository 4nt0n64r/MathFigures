package com.example.mathfigures.plainFigures

class Rectangle(var height:Int, var width:Int) {

    var x1 = 0
    var y1 = 0
    var x2 = 0
    var y2 = 0

    constructor(x1:Int,y1:Int,x2:Int,y2:Int):this(0,0){
        this.x1 = x1
        this.y1 = y1
        this.x2 = x2
        this.y2 = y2
        this.height = Math.abs(x2-x1)
        this.width = Math.abs(y2-y1)
    }

    fun countPerimeter() = 2*(width+height)
    fun countSquare() = width*height
}


