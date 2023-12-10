package com.alopes.exercises

fun main(){
    var input: String = ""
    val turnOff: String = "d"
    val factory = VehicleFactory()
    val vehicleList: MutableList<Vehicle> = mutableListOf()

    for (i in 1..2){
        val vehicle = factory.createVehicle(i % 2 )
        vehicleList.add(vehicle)
    }
    while (input!= turnOff) {

        vehicleList.forEach { vehicle ->
            println(vehicle)
            println(" velocidade atual ${vehicle.velocity}")
            if((vehicle.velocity == 0L)
            or (vehicle.velocity == vehicle.maxVelocity)) {
            println("- Para desligar o veículo digite:  d  ")
            println("- Para acelerar o veículo digite um valor positivo ou um valor negativo para desacelerar ")
            input = readln()
            }
            try {
                vehicle.acceleration= input.toLong()
                if (vehicle.acceleration > 0){
                    println(vehicle.speedUp())
                } else{ println(vehicle.slowDown())}
            }catch (e:Exception){
                if (input == turnOff){
                    println("desligando o veículo")
                }else {
                    println("valor invalido")
                }
            }
        }

    }
}
class VehicleFactory{

    fun createVehicle(type: Int): Vehicle {
        return when(type){
            1 -> Moto()
            else -> Carro()
        }
    }

}

interface Vehicle {
    val maxVelocity: Long
   var velocity : Long
    var acceleration : Long


    fun speedUp():Long

    fun slowDown():Long


}
class Moto: Vehicle{
    override val maxVelocity = 160L
    override var velocity = 0L
    override var acceleration = 0L

    override fun speedUp():Long{
        println("vamos acelerar a Moto")
        velocity += acceleration
        if (velocity > 160L){
            velocity = 160L
        }
        return velocity
    }
    override fun slowDown():Long{
        println("vamos desacelerar a Moto")
        velocity += acceleration
        if (velocity< 0){
            velocity = 0
        }
        return velocity
    }
}

class Carro: Vehicle{
    override val maxVelocity = 200L
    override var velocity = 0L
    override var acceleration = 0L

    override fun speedUp():Long{
        println("vamos acelerar o Carro")
        velocity += acceleration
        if (velocity > 200L){
            velocity = 200L
        }
        return velocity
    }
    override fun slowDown():Long{
        println("vamos desacelerar o Carro")
        velocity += acceleration
        if (velocity< 0){
            velocity = 0
        }
        return velocity
    }
}