package org.example.studentdao;

import org.example.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import java.util.List;
import javax.transaction.Transactional;


public class StudentDao {
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public int insert(Student student){
        Integer i= (Integer) this.hibernateTemplate.save(student);
        return i;
    }

    public Student getStudent(int id){
        Student student = this.hibernateTemplate.get(Student.class,id);
        return student;
    }

    public List<Student> getStudents(){
        List<Student> students = this.hibernateTemplate.loadAll(Student.class);
        return students;
    }

    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }
    @Transactional
    public void deleteStudent(int id){
      Student student =   this.hibernateTemplate.get(Student.class,id);
      this.hibernateTemplate.delete(student);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
