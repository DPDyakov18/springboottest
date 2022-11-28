package com.example.dbtest.service;

import java.util.List;

import com.example.dbtest.entity.User;
import com.example.dbtest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository up;
    @Override
    public User saveUser(User user){
        return up.save(user);
    }
    @Override
    public List<User> fetchUserList(){
        return(List<User>) up.findAll();
    }
    @Override
    public User
    updateUser(User user, int UserId)
    {

        User UserDB = (User) up.findById((long) UserId).get();
        return up.save(UserDB);
    }


    @Override
    public void deleteUserById(int UserId)
    {
        up.deleteById((long) UserId);
    }
}
