package Ejercicios

fun main(){

    //Imprimir los numeros del 1 ..10
    for (i in 1..10){
        println(i)
    }

    //Imprimir los numeros del 10 ..1 de manera descendente a>b
    for(i in 10 downTo 1){
        println(i)
    }
    //Imprimir los numeros del 10 ..1 de manera descendente a>b de dos en dos
    for(i in 10 downTo 1 step 2){
        println(i)
    }
    //Imprimir los numeros del 1 ..9
    for (i in 1 until 10){
        println(i)
    }

}