package br.com.seteideias.projetokotlin.controller

import br.com.seteideias.projetokotlin.model.Pessoa
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping("/oi")
    fun test() : String{
        val pessoa = Pessoa()
        pessoa.nome = "Carlos"
        println(pessoa.nome)
        println(pessoa.idade)
        println(pessoa)
        return pessoa.nome + " - idade.: " +pessoa.idade
    }

}