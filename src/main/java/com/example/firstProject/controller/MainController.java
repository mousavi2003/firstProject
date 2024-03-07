package com.example.firstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/calc/{operator}/{op1}/{op2}")
    public String calculating(@PathVariable("operator") String op,@PathVariable("op1") Integer x, @PathVariable("op2") Integer y){
        int sum = x + y;
        int mult = x * y;
        int div = x / y;
        int subtract = x - y;

        if (op.equals("sum"))
            return x + " + " + y + " = " + sum;
        else if (op.equals("mult"))
            return x + " * " + y + " = " + mult;
        else if (op.equals("div"))
            return x + " / " + y + " = " + div;
        else if (op.equals("subtract"))
            return x + " - " + y + " = " + subtract;
        return "Something Went Wrong!";

    }

}
