package springmvcsearch;

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
