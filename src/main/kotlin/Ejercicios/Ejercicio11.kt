package Ejercicios


fun main(){
    print("Ingrese un numero entre 1 y 99: ")
    val numeroIngresado = readLine()!!.toInt()
    if(numeroIngresado <= 99 && numeroIngresado > 0){
        println("numero descompuesto:  ${descomponerNumero(numeroIngresado)}")

        print("Ingrese un numero entre 1 y 9: ")
        val numeroIngresado_dos = readLine()!!.toInt()

        println("numero en romano: ${numeroRomano(numeroIngresado_dos)}")
        println("numero en romano (Decenas): ${numeroRomanoDecenas(numeroIngresado_dos)}")
    }else
    {
        println("el numero no esta en el rango de 1 y 99")
    }




}

/*
11. Vamos a hacer un programa que transforme un número entero a
    números romanos. Por ahora solo vamos a considerar números entre 1 y
    99. Para ello desarrolle las siguientes funciones y el programa:

    1. Escriba una función que descomponga un número entero de
        dos cifras en sus dos dígitos, es decir, la función retorna las
        decenas y las unidades del número original.
    2. Escriba otra función que reciba un número entero de un dígito
        (es decir, entre 0 y 9) y retorne el equivalente en romano de
        ese digito. O sea, para 1 retorne "I", para 2 debe retornar "II" y
        así sucesivamente. Para el cero retorne una cadena o string
        vacío, ""
    3. Escriba finalmente una función que reciba un número entero
        de un dígito, es decir, un número entre 0 y 9, y retorne el
        equivalente romano en decenas de ese número. Las decenas en
        romano son: para el 1, es una "X", para el 2, es "XX", para el 3,
        es "XXX", para el 4 es "XL", para el 5 es "L", y así
        sucesivamente.
    4. Ahora si, escriba un programa que lea un número entero, y si el
        número tiene menos de 3 cifras, utilice las funciones anteriores,
        para convertir el número a romanos (es decir, obtenga las
        decenas y unidades del número, convierta las unidades a
        romano, convierta las decenas a romano, e imprima ambos
        string en pantalla). Si el número tiene 3 o más dígitos o es
        negativo, se debe mostrar un mensaje de error.


 */

fun descomponerNumero (numeroIngresado:Int):Pair<Int,Int>{
    var numero = numeroIngresado
    val unidades = numero%10
    numero = numero/10
    val decenas = numero%10
    return decenas to unidades
}

fun numeroRomano(numeroIngresado:Int):String{
    var resultadoRomano = ""
    resultadoRomano= when (numeroIngresado.toString()){
        "0"->""
        "1"->"I"
        "2"->"II"
        "3"->"III"
        "4"->"IV"
        "5"->"V"
        "6"->"VI"
        "7"->"VII"
        "8"->"VIII"
        "9"->"IX"
        else ->"Debe ingresar un entre 1 y 9"
    }
    return resultadoRomano
}

fun numeroRomanoDecenas(numeroIngresado: Int):String{
    var resultadoRomano = ""
    resultadoRomano= when (numeroIngresado.toString()){
        "0"->""
        "1"->"X"
        "2"->"XX"
        "3"->"XXX"
        "4"->"XL"
        "5"->"L"
        "6"->"LX"
        "7"->"LXX"
        "8"->"LXXX"
        "9"->"XC"
        else ->"Debe ingresar un entre 1 y 9"
    }
    return resultadoRomano
}