package com.upiiz.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/holamundo")
    public String holaMundo() {
        return "holaMundo";
    }

    @GetMapping("/holamundodos")
    public String holaMundodos() {
        return "holaMundo de las APIS dos cn el metodo GET";
    }
}
