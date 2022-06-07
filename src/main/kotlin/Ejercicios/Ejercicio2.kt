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

/*
2. El paseo: cuando termine esta pandemia, vamos a organizar un paseo. Al paseo irán estudiantes gordos y flacos.
Un estudiante gordo ocupa dos sillas de un bus y un estudiante flaco ocupa solo una silla.
Si sabemos cuánta sillas tiene un bus, cuántos estudiantes gordos van al paseo y cuántos estudiantes flacos van al paseo, escriba una función y un programa que encuentre el número de buses que se necesitan alquilar para llevar todos esos estudiantes al paseo.

ENTRADAS
Cantidad de estudiantes gordos --> Double --> gordos
Cantidad de estudiantes flacos --> Double --> flacos
Cantidad de sillas del bus --> Double --> silla

SALIDAS
Cantidad de buses --> Double --> bus

 */
fun bus(gordos:Double, flacos:Double, silla:Double):Int{
    require(silla>0 && gordos>=0 && flacos>=0)
    var bus = Math.ceil(((gordos*2+flacos)/silla).toDouble()).toInt()
    return bus
}
