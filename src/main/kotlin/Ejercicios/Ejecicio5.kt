package Ejercicios


fun main(){
    print("ingresa R ")
    val RadioGrande = readLine()!!.toDouble()
    print("Ingresa r")
    val radio = readLine()!!.toDouble()

    print("El area de la corona es ${coronaCircular(RadioGrande,radio)} ")
}
/*
5.
    Escriba una función que halle el área de un círculo de acuerdo a la
    siguiente fórmula: A=π×r2. Ahora escriba una función que halle el área de
    la corona circular (región en verde en la siguiente figura) a partir de la
    resta de las áreas del círculo grande (con radio R) y el círculo pequeño
    (con radio r). En esta segunda función debe usar la primera. Además
    escriba un programa que lea el valor de los dos radios y, usando la
    función anterior, calcule y halle el área de la corona circular.

    FUNCION (areadelCirculo)

        ENTRADAS:

            Radio del circulo ---> Double ---> radio

        SALIDAS:

            Área del círculo ---> Double areaCirculo

    FUNCION (coronaCircular)

        ENTRADAS:

            Radio del círculo pequeño ---> Double ---> radio
            Radio del círculo grande ---> Double ---> RadioGrande

        SALIDAS:

            Área del la corona circular ---> Double ---> areaCoronaCircular

 */

fun areadelCirculo(radio:Double):Double{
    var areaCirculo = (Math.PI)*(Math.pow(radio,2.0))
    return areaCirculo
}

fun coronaCircular(RadioGrande:Double, radio:Double):Double{
    var areaCoronaCircular = areadelCirculo(RadioGrande) - areadelCirculo(radio)
    return  areaCoronaCircular
}