package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("THis is home view...!!");
//        the below comment gives nullpointer exception
//        String s = null;
//        System.out.println(s.length());

//        the below comment gives numberformat exception
//        String s ="PRata";
//        Integer.parseInt(s);
        return "home";
    }
    @RequestMapping("/search")
    public RedirectView search(@RequestParam("querybox") String q){
        System.out.println("in the search page");
        String str = "https://www.google.com/search?q="+q;
        RedirectView r = new RedirectView();
        r.setUrl(str);


        return r;
    }

   // we can use the different method for perticular exceptions and in the one
//     one method also we can write the multiple exceptions
//    for the specift error code we need to write the ResponceStatus with  pertucular values
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(value = NullPointerException.class)
//    public String errorNullPointer(Model m){
//        m.addAttribute("msg","Null Pointer Exception has occured");
//        return "error_page";
//    }
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(value = NumberFormatException.class)
//    public String errorNumberFormat(Model m){
//        m.addAttribute("msg","Number format exception has occured");
//        return "error_page";
//    }
//
////    we can write the genral exception which can handle all the exception as its a parent of all exception
//@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(value = Exception.class)
//    public String exception(Model m){
//        m.addAttribute("msg","THis is exception ");
//        return "error_page";
//    }
}

/*serving static files in spring mvc like css,js,img
 step 1 crete the folders of js,css,img in WEB-INF/resources/**
 step 2 in the spring-servlet.xml or you can use the java based config as well
        add spring-mvc in header mvc:resources and annotatino driven add
step 3 in home.jsp add tablib and tag for  css,js,img but there tablib is not working
the line 1 of home.jsp is here and i have removed that from there : <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 */