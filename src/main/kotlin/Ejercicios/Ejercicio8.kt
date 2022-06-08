package Ejercicios

fun main() {

    print("Escriba la cantidad de estudiantes: ")
    var cantEstudiantes = readLine()!!.toDouble()
    print("Escriba la capacidad del salon: ")
    var capacidadSalon = readLine()!!.toDouble()
    print("Escriba el numero de salones: ")
    var numeroSalones = readLine()!!.toDouble()

    var (totalSalones, totalPisos) = salonesypisos(cantEstudiantes, capacidadSalon,numeroSalones)
    print("La cantidad de pisos del edificio es de $totalPisos y la cantidad de salones del edificio es de $totalSalones")
}

/*
8. En el nuevo edificio de la universidad,cada piso tendrá el mismo número de salones y en todos los salones tendrán la misma capacidad (cantidad de estudiantes que caben en el salón).
Escriba una función y un programa que calcule el número de salones y el número de pisos que tendrá el nuevo edificio a partir del número de estudiantes que tiene la universidad, la capacidad del salón y el número de salones que tendrá un piso del edificio.
 */

fun salonesypisos(cantEstudiantes:Double, capacidadSalon:Double, numeroSalones:Double):Pair<Double,Double>{
    var cantidadEstudiantesPiso = capacidadSalon*numeroSalones
    var cantidadPisos = cantEstudiantes/cantidadEstudiantesPiso
    return (Math.floor(cantidadPisos) to Math.floor(cantidadPisos*numeroSalones))
}
