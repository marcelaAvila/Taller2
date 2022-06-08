package Ejercicios
import java.lang.Math.pow
import java.lang.Math.sqrt

fun main() {
    print("Escriba el valor de a: ")
    var a = readLine()!!.toDouble()
    print("Escriba el valor de b: ")
    var b = readLine()!!.toDouble()
    print("Escriba el valor de c: ")
    var c = readLine()!!.toDouble()

    println("El area del terreno es de ${areaRectangulo(b,c)+ areaTriangulo(a,b,c)}")
    println("El perimetro del terreno es de ${hallarPerimetro(a,b,c)}")

}

/*
6. Una empresa inmobiliaria vende terrenos con la forma a continuación:
Escriba funciones que nos ayuden a encontrar el área y el perímetro del terreno.
o Escriba una función que halle el área de un rectángulo a partir de su base y su altura
o Escriba una función que halle la hipotenusa de un triángulo rectángulo a partir de los catetos del triángulo.
o Encuentre el área de un triángulo a partir de su base y su altura o Encuentre el perímetro del terreno a partir de los lados A, B, C
(hay que encontrar la hipotenusa).
o El programa debe leer las dimensiones de los 3 lados y hallar el
área y el perímetro del terreno usando las funciones anteriores.
 */
fun areaRectangulo(b: Double, c: Double)=b*c
fun areaTriangulo(a: Double,b: Double, c: Double)= (b * (a-c))/2
fun hipotenusaTriangulo(a:Double,b: Double)=sqrt(pow(a,2.0) + pow(b,2.0))
fun hallarPerimetro(a:Double,b: Double,c: Double)=a+b+c+ hipotenusaTriangulo(a,b)