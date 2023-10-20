package br.com.seteideias.projetokotlin.service

import br.com.seteideias.projetokotlin.model.Pessoa
import org.springframework.stereotype.Service

@Service
class TestService {
}

fun main() {
    val pessoa = Pessoa(idade = 45, nome = "Carlos")
    println(pessoa.nome)
    println(pessoa.idade)
}