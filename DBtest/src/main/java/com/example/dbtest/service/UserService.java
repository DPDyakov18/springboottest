package com.example.dbtest.service;

import com.example.dbtest.entity.User;

import java.util.*;

public interface UserService {
    abstract User saveUser(User user);

    abstract List<User> fetchUserList();

    abstract User updateUser(User user, int UserId);

    abstract void deleteUserById(int UserId);
}
