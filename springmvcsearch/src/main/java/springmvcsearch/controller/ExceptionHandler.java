package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

//for creating the genralized excpeiton handler we created the class and on that class
//we will mentioned @ControllerAdvice annotation
@ControllerAdvice
public class ExceptionHandler {

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler(value = NullPointerException.class)
    public String errorNullPointer(Model m){
        m.addAttribute("msg","Null Pointer Exception has occured");
        return "error_page";
    }
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler(value = NumberFormatException.class)
    public String errorNumberFormat(Model m){
        m.addAttribute("msg","Number format exception has occured");
        return "error_page";
    }

    //    we can write the genral exception which can handle all the exception as its a parent of all exception
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public String exception(Model m){
        m.addAttribute("msg","THis is exception ");
        return "error_page";
    }

}
