package com.sonata.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CalculatorController {
    @GetMapping(value = "/calculator/add/{a}/{b}")
      public double add(@PathVariable double a, @PathVariable double b){
        CalculatorService cs = new CalculatorService();
          return cs.add(a, b);
      }
    @GetMapping(value = "/calculator/multiply/{a}/{b}")
    public double multiply(@PathVariable double a, @PathVariable double b){
        CalculatorService cs = new CalculatorService();
        return cs.multiply(a, b);
    }
    @GetMapping(value = "/calculator/sub/{a}/{b}")
    public double sub(@PathVariable double a, @PathVariable double b){
        CalculatorService cs = new CalculatorService();
        return cs.subtract(a, b);
    }
    @GetMapping(value = "/calculator/div/{a}/{b}")
    public double div(@PathVariable double a, @PathVariable double b){
        CalculatorService cs = new CalculatorService();
        return  cs.divide(a, b);
    }
}
