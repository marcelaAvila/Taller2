package Ejercicios

fun main() {
    print("Escriba el primer numero ")
    var a = readLine()!!.toDouble()
    print("Escriba el segundo numero ")
    var b = readLine()!!.toDouble()
    print("Escriba el operador aritmetico (+, -, *, /, % o **) ")
    var c = readLine()!!.toString()
    var(resultado, nombre) = operaciones(a,b,c)
    print("El resultado es $resultado y la operacion es $nombre")
}

fun operaciones(a:Double, b:Double, operador:String):Pair<Double,String>{
    var operacion = 0.0
    var nombreOperacion:String
    when(operador){
        "+" -> {
            nombreOperacion = "Suma"
            operacion = a+b
        }
        "-" -> {
            nombreOperacion = "Resta"
            operacion = a-b
        }
        "*" -> {
            nombreOperacion = "Multiplicacion"
            operacion = a*b
        }
        "/" -> {
            nombreOperacion = "Division"
            operacion = a/b
        }
        "%" -> {
            nombreOperacion = "Modulo"
            operacion = a%b
        }
        "**" -> {
            nombreOperacion = "Potencia"
            operacion = Math.pow(a,b)
        }
        else -> nombreOperacion = "No valido"

    }

    return Pair(operacion,nombreOperacion)
}