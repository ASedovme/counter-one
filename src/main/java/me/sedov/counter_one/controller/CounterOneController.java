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
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        {
            if (num1 == null || num2 == null) {
                return "Не заполнены параметры";
            }
        }
        return String.valueOf(service.plus(num1, num2));
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        {
            if (num1 == null || num2 == null) {
                return "Не заполнены параметры";
            }
        }
        return String.valueOf(service.minus(num1, num2));
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        {
            if (num1 == null || num2 == null) {
                return "Не заполнены параметры";
            }
        }
        return String.valueOf(service.multiply(num1, num2));
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        {
            if (num1 == null || num2 == null) {
                return "Не заполнены параметры";
            }
        }
        return String.valueOf(service.divide(num1, num2));
    }
}

