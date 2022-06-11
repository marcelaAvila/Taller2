package Ejercicios

fun main(){

    print("Ingresa la altura de la escalera")
    val alturaEcalera = readLine()!!.toDouble()
    print("ingresa el angulo teta ")
    val anguloteta = readLine()!!.toDouble()
    print("La longitud de la escalera es de ${calcularhipotenusa(alturaEcalera,anguloteta)} ")

}
/*
Escriba una función que calcule la longitud de la escalera y si conocemos
la altura que tiene la escalera (x) cuando esta inclinada sobre la pared con
un ángulo α. Tenga en cuenta la siguiente figura:

ENTRADAS:

    Altura de la escalera ----> Double ---> alturaEcalera

    Angulo teta ----> Double ---->  anguloteta

CONSTANTE:

   Radianes ---> Double --->  toRadians (Esta constante convierte los grados a radianes debido a que Math.sin() Trabaja con radianes)

SALIDA:

 Longitud de la escalera -----> Double ----> hallarlongitudEscalera
 */



fun calcularhipotenusa(alturaEcalera:Double, anguloteta:Double):Double{
    val toRadians = Math.toRadians(anguloteta)
    var hallarlongitudEscalera = alturaEcalera/Math.sin(toRadians)
    return hallarlongitudEscalera
}


