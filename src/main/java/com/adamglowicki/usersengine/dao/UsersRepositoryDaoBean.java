package com.adamglowicki.usersengine.dao;

import com.adamglowicki.usersengine.domain.User;
import com.adamglowicki.usersengine.repository.UsersRepository;

import java.util.List;

public class UsersRepositoryDaoBean implements UsersRepositoryDao {
    public void addUser(User user) {
        UsersRepository.getUserRepository().add(user);
    }

    public User getUserById(Integer Id) {
        for (User user:UsersRepository.getUserRepository()) {
            if (Id.equals(user.getId())) {
                return user;
            }
        }
        return null;
    }

    public User getUserByLogin(String login) {
        for (User user:UsersRepository.getUserRepository()) {
            if (user.getLogin().equals(login))
                return user;
        }
        return null;
    }

    public List<User> getUserList() {
        return UsersRepository.getUserRepository();
    }
}
