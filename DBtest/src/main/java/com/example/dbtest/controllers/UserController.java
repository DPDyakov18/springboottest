package com.example.dbtest.controllers;

import java.util.List;
import javax.validation.Valid;

import com.example.dbtest.entity.User;
import com.example.dbtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class UserController {
    @Autowired private UserService us;
    @PostMapping("/users")
    public User saveUser(@Valid @RequestBody User user){
        return us.saveUser(user);
    }
    @GetMapping("/users")
    public List<User> fetchUserList(){
        return us.fetchUserList();
    }
    @PutMapping("/user/{id}")
    public User updateUser(@RequestBody User user, @PathVariable("id") int userId){
        return us.updateUser(user, userId);
    }
    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable("id") int userId){
        us.deleteUserById(userId);
        return "Deleted!";
    }
}
