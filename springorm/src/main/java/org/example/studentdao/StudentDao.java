package org.example.studentdao;

import org.example.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;


public class StudentDao {
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public int insert(Student student){
        Integer i= (Integer) this.hibernateTemplate.save(student);
        return i;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
