package com.example.HaladoJava.Neptun.Service;

import com.example.HaladoJava.Neptun.Persist.UserDao;
import com.example.HaladoJava.Neptun.model.User;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List listAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public void insertUser(User user) {
        if(user.getId()<1){
            throw new InvalidParameterException("id cannot less then one");
        }
        if (userDao.idInUse(user.getId())){
            throw new InvalidParameterException("id is in use");
        }
        userDao.createUser(user);
    }

    @Override
    public User getUser(int id) throws InvalidParameterException{
        if (id<1){
            throw new InvalidParameterException("id cannot be less than one");
        }
        return userDao.selectUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
