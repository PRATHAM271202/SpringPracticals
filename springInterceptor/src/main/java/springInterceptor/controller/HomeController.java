package springInterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping("/welcome")
    public String welcome(@RequestParam("querybox") String name, Model m){
        System.out.println(name);
        m.addAttribute("name",name);
        return "welcome";
    }
}
/*
interceptor is nothing but before controller,after cotroller and before view,after view if you want to process
someting than you can do it using the interceptor .you have HandlerInterceptor interface whose implementing class
is the HandlerInterceptorAdaptor  . either you can implement that interface or you can extend the class
but in all that you have to override the method of those which are preHandler,postHandler,afterCompletion
preHandler is used for the before controller use,postHandler is used for after cotroller and before view use,and
afterCompletion is used for the after view.
 */