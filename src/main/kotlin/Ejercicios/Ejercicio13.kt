package Ejercicios

fun main(){
    println("El salario admitido para el aumento debe ser partir de $800000")
    print("Ingrese su salario: ")
    val empleadosSalario = readLine()!!.toDouble()

    println("Su nuevo salario es: ${aumentoSalario(empleadosSalario)}")
}

/*

13. La empresa La Generosa S.A desea aumentar el sueldo a sus empleados,
    para ello ha establecido las siguientes condiciones: quienes ganan hasta $
    800.000 tendrán un incremento del 10%, quienes devengan más de $
    800.000 y hasta 1’200.000 recibirán un aumento del 8% y los demás del
    5%. Se requiere una función y un programa que calcule el valor del
    aumento y el nuevo salario para un empleado.

    ENTRADAS

        Empleados Salario Actual ---------------------------------------> Double -------> empleadosSalario

    CONSTANTES

        RANGO SUELDOS
            Persona con salario de $800.000 ----------------------------> Double -------> persona_aumento_uno (incremento del 10%)
            Persona con salario mayor a $800.000 y hasta $1.200.000 ----> Double -------> persona_aumento_dos (incremento del 8%)
            Otras personas ---------------------------------------------> Double -------> persona_aumento_tres (incremento del 5%)


    SALIDAS

        Nuevo salario para la persona ----------------------------------> Double ------> nuevoSalarioPersonas

 */

fun aumentoSalario(empleadosSalario:Double):Double{
    val persona_aumento_uno = 0.10
    val persona_aumento_dos =  0.08
    val persona_aumento_tres = 0.05
    var nuevoSalarioPersonas = 0.0

        if(empleadosSalario <= 800000){
            nuevoSalarioPersonas = empleadosSalario + (empleadosSalario * persona_aumento_uno)
        }
        else if (empleadosSalario > 800000 && empleadosSalario <= 1200000){
            nuevoSalarioPersonas = empleadosSalario + (empleadosSalario * persona_aumento_dos)
        }
        else if(empleadosSalario > 1200000) {
            nuevoSalarioPersonas = empleadosSalario + (empleadosSalario * persona_aumento_tres)
        }

    return nuevoSalarioPersonas

}