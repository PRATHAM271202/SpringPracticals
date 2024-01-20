package org.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Aspect
public class MyAspect {


       @Before("execution(* org.example.service.PaymentServiceImpl.makePayment(..))")
       public void beforePayment(){
           System.out.println("Payment started....");
       }


    @After("execution(* org.example.service.PaymentServiceImpl.makePayment(..))")
       public void afterPayment(){
           System.out.println("Payment ended");
       }
}
