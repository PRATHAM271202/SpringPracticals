package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("This is home url");
        model.addAttribute("name","Pratham pratham pratham");
       model.addAttribute("id",121212);
       List<String> students = new ArrayList<String>();
       students.add("pratham");
       students.add("dhyana");
       model.addAttribute("names",students);

        return "index";
    }
}
