package Ejercicios

fun main(){
    print("Estudiantes gordos: ")
    val gordos = readLine()!!.toDouble()
    print("Estudiantes flacos: ")
    val flacos = readLine()!!.toDouble()
    print("Total sillas: ")
    val sillas = readLine()!!.toDouble()
    print("La cantidad de buses es de ${bus(gordos,flacos,sillas)}")

}
fun bus(gordos:Double, flacos:Double, silla:Double):Int{
    require(silla>0 && gordos>=0 && flacos>=0)
    var bus = Math.ceil(((gordos*2+flacos)/silla).toDouble()).toInt()
    return bus
}
