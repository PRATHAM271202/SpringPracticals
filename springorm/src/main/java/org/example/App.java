package org.example;

import org.example.entity.Student;
import org.example.studentdao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
//        Student student = new Student(123,"dhyana","Bharuch");
//      int r =   studentDao.insert(student);
//        System.out.println("added "+r);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        do {
            System.out.println("Press 1 for enter the new student : ");
            System.out.println("Press 2 for get the student with id : ");
            System.out.println("Press 3 for get all the student : ");
            System.out.println("Press 4 for updating the student : ");
            System.out.println("Press 5 for deleting the student : ");
            System.out.println("Press 6 for the exit : ");

            try{
                i = Integer.parseInt(br.readLine());
                if (i == 1) {
                    System.out.println("enter the id you want to add : ");
                    int id = Integer.parseInt(br.readLine());
                    System.out.println("enter the student name : ");
                    String name = br.readLine();
                    System.out.println("enter the student city : ");
                    String city = br.readLine();
                    Student student = new Student();
                    student.setStudentId(id);
                    student.setStudentName(name);
                    student.setStudentCity(city);
                    int r = studentDao.insert(student);
                    System.out.println("Added the student : " + r);

                } else if (i == 2) {
                    System.out.println("enter the student id whose details you want : ");
                    int id = Integer.parseInt(br.readLine());
                    Student student=studentDao.getStudent(id);
                    System.out.println(student.getStudentId()+" "+student.getStudentName()+" "+student.getStudentCity());

                } else if (i == 3) {
                    List<Student> allStudent = studentDao.getStudents();
                    for (Student s : allStudent) {
                        Student student = s;
                        System.out.println(student.getStudentId()+" "+student.getStudentName()+" "+student.getStudentCity());

                    }
                } else if (i == 4) {
                    Student student = new Student();
                    System.out.println("enter the student id whose name and city you want to change : ");
                    int id = Integer.parseInt(br.readLine());
                    System.out.println("enter the name : ");
                    String name = br.readLine();
                    System.out.println("enter the city : ");
                    String city = br.readLine();
                    student.setStudentId(id);
                    student.setStudentName(name);
                    student.setStudentCity(city);
                    studentDao.updateStudent(student);

                } else if (i == 5) {
                    System.out.println("enter the id of the student whose details you want to delete : ");
                    int id = Integer.parseInt(br.readLine());
                    studentDao.deleteStudent(id);
                } else if (i > 6) {
                    System.out.println("invalid input again type...!!");
                }

            }
            catch(Exception e){
                System.out.println("Invalid input..." );
            }

        }while(i!=6);
        System.out.println("Thank You....!!");
    }
}
