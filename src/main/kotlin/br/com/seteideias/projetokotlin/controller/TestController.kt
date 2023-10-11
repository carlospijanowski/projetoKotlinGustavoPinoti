package br.com.seteideias.projetokotlin.controller
 
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping("/oi")
    fun test() : String{
        return "testService.test()"
    }

}