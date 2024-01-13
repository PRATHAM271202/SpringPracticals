package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("THis is home view...!!");
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
}

/*serving static files in spring mvc like css,js,img
 step 1 crete the folders of js,css,img in WEB-INF/resources/**
 step 2 in the spring-servlet.xml or you can use the java based config as well
        add spring-mvc in header mvc:resources and annotatino driven add
step 3 in home.jsp add tablib and tag for  css,js,img but there tablib is not working
the line 1 of home.jsp is here and i have removed that from there : <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 */