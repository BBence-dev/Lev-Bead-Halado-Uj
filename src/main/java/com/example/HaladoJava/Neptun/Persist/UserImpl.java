package com.example.HaladoJava.Neptun.Persist;

import com.example.HaladoJava.Neptun.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserImpl implements UserDao {
    private Map<Integer, User> UserMap;
    public UserImpl()
    {
        UserMap =new HashMap<>();
        UserMap.put(1,new User(1,"Nani","Jelszo"));
    }

    @Override
    public User selectUser(int id) {

        return UserMap.get(id);
    }

    @Override
    public boolean idInUse(int id) {
        return UserMap.containsKey(id);
    }

    @Override
    public List<User> getAllUser() {
        return new ArrayList<User>(UserMap.values()) ;
    }

    @Override
    public void createUser(User user) {
        UserMap.put(user.getId(), user);
    }

    @Override
    public void updateUser(User user) {
        UserMap.replace(user.getId(), user);
    }

    @Override
    public void deleteUser(int id) {
        UserMap.remove(id);
    }
}
