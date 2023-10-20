package br.com.seteideias.studies.interfaces

    fun main(){
        val fiatCar = Fiat("Fiat");
        fiatCar.turnOn()
        println("\nautomaker defined in class that implemeted the interface is called ${fiatCar.automaker}")
    }
