package br.com.seteideias.projetokotlin.controller

import br.com.seteideias.projetokotlin.model.Pessoa
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class TestController {

    var customers = mutableListOf<Pessoa>()

    @GetMapping
    fun getPessoasList() : List<Pessoa> {
        return customers
    }

    @PostMapping
    fun addCustomer(@RequestBody personCustomer : Pessoa) : ResponseEntity<Pessoa>{
        customers.add(personCustomer)
        return ResponseEntity.status(HttpStatus.CREATED).body(personCustomer)
    }



}