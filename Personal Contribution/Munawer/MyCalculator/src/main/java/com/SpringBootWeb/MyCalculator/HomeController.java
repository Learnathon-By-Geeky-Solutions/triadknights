package com.SpringBootWeb.MyCalculator;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index.jsp";
    }

    //    Approach - 01 - (Using H)
//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session) {
//        int a = Integer.parseInt(req.getParameter("num1"));
//        int b = Integer.parseInt(req.getParameter("num2"));
//        int result = a + b;
//
//        session.setAttribute("result", result);
//
//        return "result.jsp";
//    }

//    Approach - 02 - (Using @RequestParam)
//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, HttpSession session) {
//        int result = a + b;
//
//        session.setAttribute("result", result);
//
//        return "result.jsp";
//    }

//    Approach - 03 - (Using @RequestParam and using same name as parameter)
/*    If we use the same name as parameter for mapping then there is not any
      requirement of use @RequestParam("num1") because by default it will take
      num1 and num2
 */
    @RequestMapping("/add")
    public String add(int num1, int num2, HttpSession session) {
        int result = num1 + num2;

        session.setAttribute("result", result);

        return "result.jsp";
    }

}
