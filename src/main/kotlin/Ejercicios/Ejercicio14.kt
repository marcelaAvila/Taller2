package Ejercicios

fun main() {

    print("Escriba el nombre del hermano numero 1 ")
    val nombre1 = readLine()!!
    print("Escriba la edad del hermano numero 1 ")
    val edad1 = readLine()!!.toInt()
    print("Escriba el nombre del hermano numero 2 ")
    val nombre2 = readLine()!!
    print("Escriba la edad del hermano numero 2 ")
    val edad2 = readLine()!!.toInt()
    print("Escriba el nombre del hermano numero 3 ")
    val nombre3 = readLine()!!
    print("Escriba la edad del hermano numero 3 ")
    val edad3 = readLine()!!.toInt()

    print("El nombre del hermano mayor es ${mayor(nombre1, edad1, nombre2, edad2, nombre3,edad3)}")
}

fun mayor(hermano1:String, edad1:Int, hermano2:String, edad2:Int, hermano3:String,edad3:Int):String{

    var nombreMayor = when {
        (edad1>edad2 && edad1>edad3) -> hermano1
        (edad2>edad1 && edad2>edad3) -> hermano2
        (edad3>edad1 && edad3>edad2) -> hermano3
        else -> "No disponible"
    }

    return nombreMayor

}