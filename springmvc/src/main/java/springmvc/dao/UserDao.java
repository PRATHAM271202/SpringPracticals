package springmvc.dao;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springmvc.model.User;
import org.hibernate.query.Query;
import org.hibernate.Session;


import java.util.List;

@Service
public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public String saveUser(User user){
       String i =(String)  this.hibernateTemplate.save(user);
       return i;
    }

    public List<User> getUser(){
        List<User> users = this.hibernateTemplate.loadAll(User.class);
        return users;
    }

    @Transactional
    public User getUsers(String email,String password){
        String hql = "FROM User WHERE Email = :email AND Password = :password";
        Query query = this.hibernateTemplate.getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("email", email);
        query.setParameter("password", password);

        return (User) query.uniqueResult();
    }


}
