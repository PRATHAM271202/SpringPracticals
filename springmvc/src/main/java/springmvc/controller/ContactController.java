package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.model.User;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String show(Model m){
        m.addAttribute("header","Pratham The Coder");
        m.addAttribute("discription","This is home for me");
         return "contact";
    }
//    @RequestMapping(path = "/processform",method = RequestMethod.POST)
//    public String handleForm(@RequestParam("email") String mail,
//                             @RequestParam("userName") String name,
//                             @RequestParam("userPassword") String password, Model model){
//
//        System.out.println("The email of the use is : "+mail+" "+name+" "+password);
//
//        User user = new User();
//           user.setUserName(name);
//           user.setUserPassword(password);
//           user.setEmail(mail);
//
//           model.addAttribute("user",user);
////        model.addAttribute("name",name);
////        model.addAttribute("mail",mail);
////        model.addAttribute("password",password);
//        return "sucess";
//    }
      @ModelAttribute
      public void commonMeth(Model m){
          m.addAttribute("header","Pratham The Coder");
          m.addAttribute("discription","This is home for me");
          System.out.println("this method will call first whenever the request for any path comes");
      }
    @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user,Model model){
        System.out.println("The object values are : "+user);
       //here the model attribute does all the work which we have done in the previous commented method
        model.addAttribute("header","Pratham The Coder");
        model.addAttribute("discription","This is home for me");
        return "sucess";
    }
}
