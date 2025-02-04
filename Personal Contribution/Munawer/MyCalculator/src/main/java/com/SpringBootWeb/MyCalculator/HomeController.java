package com.SpringBootWeb.MyCalculator;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView add(int num1, int num2, ModelAndView mv) {
        int result = num1 + num2;

        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }

}
