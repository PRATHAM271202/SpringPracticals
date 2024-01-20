package org.example;

import org.example.service.PaymentService;
import org.example.service.PaymentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext obj = new ClassPathXmlApplicationContext("config.xml");
        PaymentService paymentService=(PaymentService) obj.getBean("payment");
         //        Before this method this will call makePayment.beforePayment()
        paymentService.makePayment(5000);
        //        after this method this will call makePayment.afterPayment()
    }
}
