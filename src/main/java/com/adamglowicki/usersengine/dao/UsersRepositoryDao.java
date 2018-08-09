package com.adamglowicki.usersengine.dao;

import com.adamglowicki.usersengine.domain.User;

import java.net.UnknownServiceException;
import java.util.List;

public interface UsersRepositoryDao {

    void addUser(User user);
    User getUserById(Integer Id);
    User getUserByLogin(String login);
    List<User> getUserList();

}
