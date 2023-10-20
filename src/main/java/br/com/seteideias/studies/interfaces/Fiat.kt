package br.com.seteideias.studies.interfaces

data class Fiat(val automakerContructor : String ): Carro {

    override var automaker = this.automakerContructor

    override fun turnOn() {
        super.turnOn()
    }

}