package org.example;

import org.example.entity.Student;
import org.example.studentdao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App
{
//    this command has to added
    public static void main( String[] args )
    {
        ApplicationContext app =  new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao =  app.getBean("studentDao",StudentDao.class);
        Student student = new Student(123,"dhyana","Bharuch");
      int r =   studentDao.insert(student);
        System.out.println("added "+r);
    }
}
