package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody  //for allowing the method to return string rather than the jsp form
public class TestController {

    @RequestMapping("/test")
    public String firstHandler(){
        return "Just For Testing!!!!";
    }
}
