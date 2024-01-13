package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
/*
file upload spring-mvc
we will use common multipart resolve similar to view resolver
but we need to use its implementation as it is interface

step 1 : add dependency common fileupload and commons io
step 2 : add bean similar to viewResolver but here its
         class is commonMultipartResolver class is there
         and it is in the spring-servlet.xml must remember give the name in mutliPartResolver otherwise it will give error

         org.springframework.web.multipart.commons.CommonsMultipartyResolver has been superseded
         by org.springframework.web.multipart.support.StandardServletMultipartResolver since all
         Servlet 5.0+ containers have built-in multipart support now.

step 3 : create the form in jsp file in views bootstrap
         and controller make sure you create the controller
         in the springmvc package as it is mentioned in
         base-package


*/