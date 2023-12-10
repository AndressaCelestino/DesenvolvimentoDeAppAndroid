package com.alopes.exercises

fun main() {
    var person = Person()
    person.name= "Tiago"
    person.email= "tiago@test.com"

    var player = Player()
    player.name = "Kaka"
    player.email = "kaka@test.com"
    player.number = 10

    println(person)
    println(player)
}

open class Person{
    var name: String = ""
    var email: String = ""

    override fun toString() = " Name: $name email: $email"
}

class Player : Person(){
    var number: Int = 0

    override fun toString() = super.toString() + " Number: $number"
}