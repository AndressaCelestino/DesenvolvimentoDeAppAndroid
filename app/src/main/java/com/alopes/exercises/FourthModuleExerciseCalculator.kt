package com.alopes.exercises


fun main() {
    /*************** Calculadora funções compactas e de ordem superior ***************/
    println("digite o primeiro numero")
    val number1: Int = (readln()).toInt()

    println("digite o segundo numero")
    val number2: Int = (readln()).toInt()

    println("digite + para somar, - para subtrair, * para multiplicar e / para dividir")
    val operationSelectiion: String = (readln())
    print(" O resultado de $number1 $operationSelectiion $number2 é: ")

    when(operationSelectiion){
         "+" -> calculator(number1 ,number2, ::sum)
         "-" -> calculator(number1,number2, ::subtraction)
         "*" -> calculator(number1,number2, ::multiplication)
         "/" -> calculator(number1,number2, ::division)
        else -> print("Operação Invalida")
    }

}
fun calculator (number1:Int, number2:Int, operation:(Int,Int)->Unit){
    operation(number1,number2)
}

fun sum(number1: Int,number2: Int)= println(number1 + number2)
fun subtraction(number1: Int,number2: Int)= println(number1 - number2)
fun multiplication(number1: Int,number2: Int)= println(number1 * number2)
fun division(number1: Int,number2: Int)= println(number1 / number2)
