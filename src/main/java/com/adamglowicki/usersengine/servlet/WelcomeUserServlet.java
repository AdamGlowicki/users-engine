package com.adamglowicki.usersengine.servlet;

import com.adamglowicki.usersengine.dao.UsersRepositoryDao;
import com.adamglowicki.usersengine.dao.UsersRepositoryDaoBean;
import com.adamglowicki.usersengine.repository.UsersRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome-user")
public class WelcomeUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UsersRepositoryDao dao = new UsersRepositoryDaoBean();
        String name = req.getParameter("name");



        if (name.equals(null)){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
        else {
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter writer = resp.getWriter();
            writer.println("<!DOCTYPE html><body>...</body></html>");
            writer.println("Name: "+ name);

        }
    }
}
