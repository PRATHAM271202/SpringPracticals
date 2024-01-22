package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@ResponseBody  //for allowing the method to return string rather than the jsp form
public class TestController {

//    @RequestMapping("/test")
//    public String firstHandler(){
//        return "Just For Testing!!!!";
//    }

    @RequestMapping("/home")
    public String home(){
        System.out.println("This is home method");
        return "home";
    }

    @RequestMapping("/contact")
    public String contact(){
        System.out.println("inside the contact method");
        return "contact";
    }
}

/*
steps for jsp configuration :
1 create folder webapp in that create folder views
2 then in application.properties add prefix sufix of folder and file
3 now in the pom.xml add tomcat embeded japser depencdey because otherwise it will download not convert
  jsp to servlet
 that's it
 */