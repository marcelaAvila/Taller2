package Ejercicios

fun main(){

    //----------------------- ******* Se encontraron 2 errores en las fórmulas con las que se plantea el problema realizado
    //---------------------- ******** Error en: la formula de distancia entre dos puntos
    //---------------------- ******** Error en: La formula de punto medio entre dos puntos
    //---------------------- Por esta razon se corrigieron dichas fórmulas en el desarrollo de este ejercicio--------------------------////
    print("Ingrese el punto x1: ")
    val x_uno = readLine()!!.toDouble()
    print("Ingrese el punto y1: ")
    val y_uno = readLine()!!.toDouble()
    print("Ingrese el punto x2: ")
    val x_dos = readLine()!!.toDouble()
    print("Ingrese el punto y2: ")
    val y_dos = readLine()!!.toDouble()


    println("La distancia entre los puntos es: ${distanciaEntrePuntos(y_dos,y_uno,x_dos,x_uno)}")
    println("La pendiente de la recta es: ${pendienteEntrePuntos(y_dos,y_uno,x_dos,x_uno)}")
    println("Las coodernadas del punto medio es: ${coordenadasPuntoMedio(x_uno,x_dos,y_uno,y_dos)}")


}

/*
    7.
        Todo punto del eje cartesiano está descrito por dos elementos: la
        coordenada x (o «abscisa») y su coordenada y (que también se llama la
        «ordenada»). Suponga que tenemos las coordenadas (x, y) de dos
        puntos: x1 y y1 para el primer punto, y también x2y y2 para el segundo
        punto. Vamos a construir funciones y un programa que nos ayude a

        Escriba una función que halle la distancia entre dos puntos de
        acuerdo a la siguiente fórmula:
        d=(y2−y1)2+(x2−x1)2

        o Escriba una función que reciba las coordenadas de dos puntos
            y que retorne la pendiente de la recta que une esos dos
            puntos. Recordemos qu e la pendiente se obtiene con la
            fórmula:
            m=y2−y1x2−x1
        o Escriba una función que reciba las coordenadas de dos puntos
            y que retorne las coordenadas del punto medio que se
            encuentra entre ellos. Las dos coordenadas se hallan a partir de
            la siguiente fórmula:
            xm=x1+x22
            ym=y1+y22
        o Ahora escriba un programa que lea las dos coordenadas de dos
            puntos, y que imprima, usando las funciones anteriores, la
            distancia entre esos puntos, la pendiente de la recta que une
            esos dos puntos y el punto medio.
            quadruple.

--------*Función distancia entre puntos

        ENTRADAS:

            Coordenadas de punto 1

                x uno ----> Double ----> x_uno
                y uno ----> Double ----> y_uno

            Coordenadas de punto 2

                x dos ----> Double ----> x_dos
                y dos ----> Double ----> y_dos

        SALIDAS:

            Distancia entre los puntos ------> Double ----> distanciaResultados

--------*Función Pendiente entre puntos

        ENTRADAS:

            Coordenadas de punto 1

                x uno ----> Double ----> x_uno
                y uno ----> Double ----> y_uno

            Coordenadas de punto 2

                x dos ----> Double ----> x_dos
                y dos ----> Double ----> y_dos

        SALIDAS:

            Pendiente de la recta ------> Double ----> pendienteResultado


--------*Función Coordenadas de punto medio

        ENTRADAS:

            Coordenadas de punto 1

                x uno ----> Double ----> x_uno
                y uno ----> Double ----> y_uno

            Coordenadas de punto 2

                x dos ----> Double ----> x_dos
                y dos ----> Double ----> y_dos

        SALIDAS:

            Punto medio x ------> Double ----> puntoMedioX
            Punto medio y ------> Double ----> puntoMedioY
 */

/*
data class Quadruple(val y_uno:Double, val y_dos:Double, val x_uno:Double, val x_dos:Double)
*/

fun distanciaEntrePuntos (y_uno:Double,y_dos:Double,x_uno:Double, x_dos:Double):Double{

    var distanciaResultados = Math.sqrt(Math.pow((y_dos-y_uno),2.0) + Math.pow((x_dos-x_uno),2.0)).toDouble()

    return distanciaResultados
}

fun pendienteEntrePuntos (y_uno:Double,y_dos:Double,x_uno:Double, x_dos:Double):Double{

    var pendienteResultado = (y_dos-y_uno)/(x_dos-x_uno)

    return pendienteResultado
}

fun coordenadasPuntoMedio(y_uno:Double,y_dos:Double,x_uno:Double, x_dos:Double):Pair<Double,Double>{
    var puntoMedioX = (x_uno+x_dos)/2
    var puntoMedioY = (y_uno+y_dos)/2
    return puntoMedioX to puntoMedioY
}


