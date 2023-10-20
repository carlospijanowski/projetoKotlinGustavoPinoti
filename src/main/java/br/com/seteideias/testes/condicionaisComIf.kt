package br.com.seteideias.testes

fun main() {

    println("ooi")

    val temperatura = 26

    val bolResult = if(temperatura==26)true else{false}

    println(bolResult)

    when(temperatura){
        25 -> println("deu!")
        26,27 -> println("aqui")
        in 30 .. 35 -> println("eita")
        else -> println("no else")
    }

}

fun `test jfdks`(){

}