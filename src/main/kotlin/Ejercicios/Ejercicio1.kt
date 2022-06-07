package Ejercicios

import java.lang.Math.pow
fun main (){

    print("Ingrese x: ")
    val x = readln()!!.toDouble()
    print("Ingrese y: ")
    val y = readLine()!!.toDouble()

    println("El resultado es : ${ejercicio_1(x,y)}")

}

/*
1. Escriba una función en Kotlinyunprogramaqueuseesafunción,que encuentre el valor de la siguiente función algebraica: f(x,y)=x2−2xy+y2
*/
fun ejercicio_1(x:Double, y:Double) = pow(x,2.0)-(2*x*y)+pow(y,2.0)