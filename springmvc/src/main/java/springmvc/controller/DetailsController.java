package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.Login;
import springmvc.model.User;
import springmvc.service.UserService;

import java.util.List;

@Controller
public class DetailsController {
    @Autowired
     private UserService userService;


      @RequestMapping("/details")
      public String handleRequest(Model model){

          model.addAttribute("header","Details Page");
          model.addAttribute("description","Add All The Details");

          return "details";
      }

    @RequestMapping(path = "/processDetails",method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user,Model model){

//        model.addAttribute("header","You Are in the details page");
//        model.addAttribute("discription","below are the details");
        model.addAttribute("header","You have Successfully Added the details");
        user.updateLocalDate(user.getBd());
        boolean val=true;
        String firstName=user.getUserFirstName();
        String secondName=user.getUserLastName();
        String dob =user.getBd();
        user.updatePrnNo(firstName,dob,secondName);
        user.updateStatus(val);
        System.out.println("prn is : "+user.getPrnNo());
        System.out.println("Status is : "+user.isStatus());
       String r= this.userService.createUser(user);
        System.out.println("The object values are : "+user.toString()+" " +r);
        return "sucessDetails";
    }



    @RequestMapping(path = "/userDetails",method = RequestMethod.POST)
    public String userDetail(Model model){
        List<User> r= this.userService.getAllUser();
           model.addAttribute("list",r);
//        List<User> r= this.userService.getAllUser();
//          for(User u :r){
//              User user = u;
//              System.out.println("User{" +
//                      "email='" + user.getEmail() + '\'' +
//                      ", userFirstName='" + user.getUserFirstName() + '\'' +
//                      ", userLastName='" + user.getUserLastName() + '\'' +
//                      ", userPassword='" + user.getUserPassword() + '\'' +
//                      ", status=" + user.isStatus() +
//                      ", birthDate=" + user.getBirthDate() +
//                      ", prnNo='" + user.getPrnNo() + '\'' +
//                      '}');
//          }
        return "userdetails";
    }

    @RequestMapping(path = "/userLogin",method = RequestMethod.POST)
    public String userLogin(){
        return "userlogin";
    }

    @RequestMapping(path = "/login",method = RequestMethod.POST)
    public String handleForm(@ModelAttribute Login login,Model model){
          String email = login.getEmail();
          String pwd = login.getUserPassword();

        System.out.println("The entered email was "+email+" and the pwd was "+pwd);

        User r= this.userService.getLogin(email,pwd);
        System.out.println("the user is "+r);
        model.addAttribute("user",r);
        return "loginsucess";
    }
}
