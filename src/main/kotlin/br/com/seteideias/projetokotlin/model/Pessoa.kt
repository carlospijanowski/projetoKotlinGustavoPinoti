package br.com.seteideias.projetokotlin.model

data class Pessoa (var nome : String = "VAZIO", var idade : Int = 0) {
    override fun toString(): String {
        return "OVERRIDE"
    }
}