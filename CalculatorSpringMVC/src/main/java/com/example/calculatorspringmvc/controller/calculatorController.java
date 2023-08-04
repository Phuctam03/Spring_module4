package com.example.calculatorspringmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class calculatorController {
    @GetMapping("/calculator")
    public String calculator() {
        return "/calculator";
    }

    @PostMapping("/cal")
    public String calculate(@RequestParam double first, @RequestParam double second, String calculator, Model model) {
        double cal = 0;
        switch (calculator) {
            case "Addition(+)":
                cal = first + second;
                break;
            case "Subtraction(-)":
                cal = first - second;
                break;
            case "Multiplication(*)":
                cal = first * second;
                break;
            case "Division(/)":
                if (second != 0) {
                    cal = first / second;
                } else {
                    model.addAttribute("message", "Can't by divide zero");
                }
            default:
                break;
        }
        model.addAttribute("calculate", cal);
        model.addAttribute("second",second);
        return "/calculator";

    }

}
