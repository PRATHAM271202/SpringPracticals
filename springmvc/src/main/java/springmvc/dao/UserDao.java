package springmvc.dao;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springmvc.model.User;

@Service
public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public String saveUser(User user){
       String i =(String)  this.hibernateTemplate.save(user);
       return i;
    }
}
