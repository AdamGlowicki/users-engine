package com.adamglowicki.usersengine.servlet;

import com.adamglowicki.usersengine.dao.UsersRepositoryDao;
import com.adamglowicki.usersengine.dao.UsersRepositoryDaoBean;
import com.adamglowicki.usersengine.domain.User;
import com.adamglowicki.usersengine.repository.UsersRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/find-user-by-id")
public class FindUserByIdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsersRepositoryDao dao = new UsersRepositoryDaoBean();

        String idFromAdress = req.getParameter("id");
        Integer id = Integer.parseInt(idFromAdress);

        User userById = dao.getUserById(id);

        if (idFromAdress.equals(null)){
            resp.setStatus(HttpServletResponse.SC_BAD_GATEWAY);
        }
        else{
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter writer = resp.getWriter();
            writer.println("<!DOCTYPE html><html><body>...</body></html>");
            writer.println("User: " + dao.getUserById(id).getLogin());
            writer.println("User: " + id);
            writer.println(dao.getUserById(id).getId());
        }

    }
}
