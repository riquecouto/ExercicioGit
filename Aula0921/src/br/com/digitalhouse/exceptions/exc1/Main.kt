package br.com.digitalhouse.exceptions.exc1

fun main() {

    try {
        val list = listOf("Pato", "Cachorro", "Gato")
        //parabens

        println(list.get(3))

    } catch (ex: Exception){
        println("Exceção: ${ex.message}")
    }
}