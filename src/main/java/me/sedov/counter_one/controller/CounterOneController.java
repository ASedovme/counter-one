package me.sedov.counter_one.controller;

import me.sedov.counter_one.service.CounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CounterOneController {

    private final CounterService service;

    public CounterOneController(CounterService service) {
        this.service = service;
    }

    @GetMapping
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2){
        return num1 + "+" + num2 + "=" +  service.plus(num1,num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2){
        return num1 + "-" + num2 + "=" +  service.minus(num1,num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2){
        return num1 + "*" + num2 + "=" +  service.multiply(num1,num2);}

    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2){
        if (num2!=0){
        return num1 + "/" + num2 + "=" +  service.divide(num1,num2);}
        else return "На ноль делить нельзя";
    }
}
