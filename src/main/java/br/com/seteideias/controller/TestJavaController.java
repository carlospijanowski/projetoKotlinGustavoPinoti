package br.com.seteideias.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJavaController {

    @GetMapping("/oi2")
    public String getStringTest(){
        return "no java";
    }

}
