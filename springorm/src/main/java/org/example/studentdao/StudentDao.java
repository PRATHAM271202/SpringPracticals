package org.example.studentdao;

import org.example.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;
    public int insert(Student student){
        Integer i= (Integer) this.hibernateTemplate.save(student);
        return i;
    }
}
