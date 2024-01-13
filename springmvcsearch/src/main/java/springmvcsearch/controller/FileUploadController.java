package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FileUploadController {

    @RequestMapping("/fileform")
    public String showUploadForm(){
        System.out.println("inside the showuploadform");
        return "fileform";
    }
    @RequestMapping(path = "/uploadimage",method = RequestMethod.POST)
    public String uploadFile(){
        System.out.println("File uploaded successfully");
        return "filesuccess";
    }
}
