package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.dao.UserDao;
import springmvc.model.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public String createUser(User user){

        return this.userDao.saveUser(user);
    }

    public List<User> getAllUser(){
        return this.userDao.getUser();
    }

    public User getLogin(String email,String pwd){
        return this.userDao.getUsers(email,pwd);
    }

}
