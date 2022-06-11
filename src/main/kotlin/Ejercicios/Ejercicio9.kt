package Ejercicios

fun main(){
    print("Ingrese el primer número: ")
    val numero_uno = readLine()!!.toDouble()
    print("Ingrese el segundo número: ")
    val numero_dos = readLine()!!.toDouble()

    print("El número mayor es: ${mayorNumero(numero_uno,numero_dos)}")
}

/*
    9. Escribir una función que reciba dos números enteros y retorne el mayor
    número de los dos. Escriba un programa, que lea dos números enteros, y
    usando la función anterior, imprima el mayor de los dos.

    ENTRADAS:

        Primer número ---> Double ----> numero_uno

        Segundo número ---> Double ----> numero_dos

    SALIDA:

        Número Mayor ---> Double ---->  resultadoMax


 */

fun mayorNumero (numero_uno:Double,numero_dos:Double):Double{
    val resultadoMax = Math.max(numero_uno,numero_dos)
    return resultadoMax

}