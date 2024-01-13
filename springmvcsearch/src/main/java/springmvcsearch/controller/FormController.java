package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvcsearch.entity.Student;

@Controller
public class FormController {

    @RequestMapping("/complex")
    public String showForm(){
        return "complex_form";
    }
    @RequestMapping("/handle")
    public String formHandle(@ModelAttribute("student")Student student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "complex_form";
        }
        System.out.println(student);
        System.out.println(student.getAddress());
        return "success";
    }
}
