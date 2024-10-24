package me.sedov.counter_one.service;

import org.springframework.stereotype.Service;

@Service
public class CounterService {


    public String plus(Integer num1, Integer num2) {
        return num1 + "+" + num2 + "=" + (num1 + num2);
    }

    public String minus(Integer num1, Integer num2) {
        return num1 + "-" + num2 + "=" + (num1 - num2);
    }

    public String multiply(Integer num1, Integer num2) {
        return num1 + "*" + num2 + "=" + (num1 * num2);
    }

    public String divide(Integer num1, Integer num2) {
        {
            if (num2 != 0) {
                return String.valueOf(num1 + "/" + num2 + "=" + (num1 / (double)num2));
            } else return String.valueOf("На ноль делить нельзя");
        }
    }
}
