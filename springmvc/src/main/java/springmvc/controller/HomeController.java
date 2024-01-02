package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(path = "/help",method = RequestMethod.GET)
    public ModelAndView help(){
        System.out.println("This is method is help method id the controller");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("sname","Pratham Dhobi");
        modelAndView.addObject("sid",343434);
        List<String> sstudents = new ArrayList<String>();
        sstudents.add("pratham");
        sstudents.add("dhyana");
        modelAndView.addObject("snames","sstudents");
        modelAndView.setViewName("help");
        return modelAndView;
    }
}
