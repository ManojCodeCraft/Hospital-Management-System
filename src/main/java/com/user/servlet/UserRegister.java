package com.user.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.User;
import com.db.DBConnect;
import com.dao.UserDao;

@WebServlet("/register")
public class UserRegister extends HttpServlet {
    private static final long serialVersionUID = 1L; // Recommended for serialization

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String fullName = req.getParameter("fullname");
            String email = req.getParameter("email");
            String password = req.getParameter("password");

            User u = new User(fullName, email, password);
            UserDao dao = new UserDao(DBConnect.getConn());

            boolean f = dao.register(u);

            if (f) {
                System.out.println("Successful");
            } else {
                System.out.println("Errors in the server");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
