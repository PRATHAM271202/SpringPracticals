package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;

@Controller
public class DetailsController {



      @RequestMapping("/details")
      public String handleRequest(Model model){

          model.addAttribute("header","Details Page");
          model.addAttribute("description","Add All The Details");

          return "details";
      }

    @RequestMapping(path = "/processDetails",method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user,Model model){

        model.addAttribute("header","You Are in the details page");
        model.addAttribute("discription","below are the details");
        user.updateLocalDate(user.getBd());
        System.out.println("The object values are : "+user.toString());
        return "sucessDetails";
    }
}
