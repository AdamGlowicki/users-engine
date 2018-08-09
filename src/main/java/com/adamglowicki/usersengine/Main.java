package com.adamglowicki.usersengine;

import com.adamglowicki.usersengine.dao.UsersRepositoryDao;
import com.adamglowicki.usersengine.dao.UsersRepositoryDaoBean;
import com.adamglowicki.usersengine.domain.User;
import com.adamglowicki.usersengine.repository.UsersRepository;

public class Main {

    public static void main(String[] args) {
        UsersRepositoryDao dao = new UsersRepositoryDaoBean();
        String login = dao.getUserById(3).getLogin();
        System.out.println(login);
    }
}
