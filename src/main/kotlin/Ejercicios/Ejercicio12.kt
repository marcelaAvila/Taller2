package Ejercicios

fun main(){

    print("¿Cual es el dia de hoy? ")
    val dia = readLine()!!.toString()
    print("El dia de mañana es ${dia(dia)}")
}

/*
12. Escribir una función que reciba el nombre de un día (por ejemplo "lunes" o "martes", etc.) y retorne el nombre del día de mañana.
Usando la función anterior, escriba un programa que lea el nombre de un día y que imprima el nombre del día de mañana.

ENTRADAS
Dia de hoy --> String --> x
SALIDAS
Dia de mañana --> String --> x
 */
fun dia(x:String)=when(x){
    "Lunes"->"Martes"
    "Martes"->"Miercoles"
    "Miercoles"->"Jueves"
    "Jueves"->"Viernes"
    "Viernes"->"Sabado"
    "Sabado"->"Domingo"
    "Domingo"->"Lunes"
    else ->"Debe ingresar un dia de la semana"
}

/*fun dia(x:String):String{
    val mañana:String
    mañana=when(x){
        "Lunes"->"Martes"
        "Martes"->"Miercoles"
        "Miercoles"->"Jueves"
        "Jueves"->"Viernes"
        "Viernes"->"Sabado"
        "Sabado"->"Domingo"
        "Domingo"->"Lunes"
        else ->"Debe ingresar un dia de la semana"
    }
    return mañana
}*/

