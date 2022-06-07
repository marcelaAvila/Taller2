package Ejercicios

fun main(){

    print("¿Cual es el dia de hoy? ")
    val dia = readLine()!!.toString()
    print("El dia de mañana es ${dia(dia)}")
}
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

