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
1. Escriba una función en Kotlin y un programa que use esa función,que encuentre el valor de la siguiente función algebraica: f(x,y)=x2−2xy+y2

ENTRADAS
Valor de x --> Double --> x
Valor de y --> Double --> y

SALIDAS
Resultado función algebraica
*/
fun ejercicio_1(x:Double, y:Double) = pow(x,2.0)-(2*x*y)+pow(y,2.0)