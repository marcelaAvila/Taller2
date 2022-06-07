package Ejercicios

fun main() {

    print("Ingrese el sueldo mensual ")
    val sueldo = readLine()!!.toDouble()
    val (arriendo, comida, dinerofinal) = gastosMensuales(sueldo)
    println("El arriendo es de ${arriendo}")
    println("La comida es de ${comida}")
    println("El dinero restante es de ${dinerofinal}")


}

/*
4. Escriba una función y un programa en Kotlin que resuelva el siguiente
problema: Pedro acabó de recibir el sueldo mensual. Si se gasta el 40% de ese sueldo en el arriendo y el 15% del sueldo en comida, determine cuánto dinero se gastó en cada uno de esos dos ítems (en arriendo y en comida) y cuanto dinero le queda al final.

 ENTRADAS
 Ingreso mensual -->Double--> ingresoMensual

 SALIDAS
 Arriendo --> Double
 Comida --> Double
 Dinero Restante -->Double
 */

fun gastosMensuales(ingresoMensual:Double)=Triple(ingresoMensual * 0.4, ingresoMensual * 0.15, ingresoMensual * 0.45)

