package com.alopes.exercises

fun main(){
    var vehicle1 = Vehicle()
    vehicle1.model= "Passat"
    var input: String = ""
    val turnOff: String = "d"

    while (input!= turnOff){
        if((vehicle1.getVelocity() == 0L)
            or (vehicle1.getVelocity() == vehicle1.maxVelocity)) {
            println("- Para desligar o veículo digite:  d  ")
            println("- Para acelerar o veículo digite um valor positivo ou um valor negativo para desacelerar ")
            input = readln()
        }

        try {
            vehicle1.acceleration= input.toLong()
            if (vehicle1.acceleration > 0){
                println(vehicle1.speedUp())
            } else{ println(vehicle1.slowDown())}
        }catch (e:Exception){
            if (input == turnOff){
                println("desligando o veículo")
            }else {
                println("valor invalido")
            }
        }
    }
}

class Vehicle {
    val maxVelocity: Long = 200L
   private var velocity : Long = 0
    var acceleration : Long = 0
    var model : String = ""

    fun speedUp():Long{
            velocity += acceleration
            if (velocity > 200){
                velocity = 200
            }
        return velocity
    }

    fun slowDown():Long{
                velocity += acceleration
                if (velocity< 0){
                    velocity = 0
                }
            return velocity
        }

    fun getVelocity():Long{
        return velocity
    }
}

