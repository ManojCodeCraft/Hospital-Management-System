package com.user.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.User;
import com.db.DBConnect;
import com.dao.UserDao;

@WebServlet("/register")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Handle GET requests (for direct access to /register)
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/signup.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String fullName = req.getParameter("fullname");
			String email = req.getParameter("email");
			String password = req.getParameter("password");

			User u = new User(fullName, email, password);
			UserDao dao = new UserDao(DBConnect.getConn());
			HttpSession session = req.getSession();
			boolean f = dao.register(u);

			if (f) {
				session.setAttribute("sucMsg", "Register successful");
			} else {
				session.setAttribute("errMsg", "Internal Server Error");
			}

			// Redirect to signup.jsp (since it's in webapp)
			resp.sendRedirect(req.getContextPath() + "/signup.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
