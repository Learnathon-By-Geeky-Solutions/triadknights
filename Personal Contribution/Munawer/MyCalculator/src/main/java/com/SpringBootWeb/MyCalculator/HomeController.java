package com.SpringBootWeb.MyCalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    // Using @GetMapping to explicitly specify GET method for the home page
    @GetMapping("/")
    public String home() {
        return "index"; // Return the homepage view
    }

    // Using @PostMapping to explicitly specify POST method for the calculation
    @PostMapping("/calculate")
    public ModelAndView calculate( int num1, int num2, String operation, ModelAndView mv) {
        String message = "";
        double result = 0;

        switch (operation) {
            case "add":
                result = num1 + num2;
                message = "Addition Result:";
                break;
            case "subtract":
                result = num1 - num2;
                message = "Subtraction Result:";
                break;
            case "multiply":
                result = num1 * num2;
                message = "Multiplication Result:";
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                    message = "Division Result:";
                } else {
                    message = "Error: Division by zero!";
                }
                break;
            default:
                message = "Invalid Operation!";
        }

        mv.addObject("message", message);

        if (num2 == 0 && operation.equals("divide")) {
            mv.addObject("result", "INFINITY");
        } else {
            mv.addObject("result", result);
        }

        mv.setViewName("result");

        return mv;
    }
}
