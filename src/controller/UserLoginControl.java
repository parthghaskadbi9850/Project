package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.userDAO;
import dao.implement.userDAOimpl;
import model.User;

@WebServlet("/userlogin")
public class UserLoginControl extends HttpServlet{
	
	 private static final long serialVersionUID = 1L;
	 
	    public UserLoginControl() {
	        super();
	    }
	 
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	         
	        userDAO dao = new userDAOimpl();
	         
	        try {
	            User user = dao.checkLogin(email, password);
	            String destPage = "userlogin.jsp";
	             
	            if (user != null) {
	                HttpSession session = request.getSession();
	                session.setAttribute("user", user);
	                destPage = "showuser.jsp";
	            } else {
	                String message = "Invalid email/password";
	                request.setAttribute("message", message);
	            }
	             
	            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
	            dispatcher.forward(request, response);
	             
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	    }


}
