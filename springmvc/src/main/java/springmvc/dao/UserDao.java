package springmvc.dao;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import springmvc.model.User;

public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    public int saveUser(User user){
       Integer i =(Integer)  this.hibernateTemplate.save(user);
       return i;
    }
}
