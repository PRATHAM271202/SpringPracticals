package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String show(){
         return "contact";
    }
    @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String handleForm(@RequestParam("email") String mail,
                             @RequestParam("userName") String name,
                             @RequestParam("userPassword") String password, Model model){

        System.out.println("The email of the use is : "+mail+" "+name+" "+password);
        model.addAttribute("name",name);
        model.addAttribute("mail",mail);
        model.addAttribute("password",password);
        return "sucess";
    }
}
