package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userDAO;
import dao.implement.userDAOimpl;
import model.User;

@WebServlet("/register")
public class UserControl extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("username");
		long phone = Long.parseLong(request.getParameter("phone"));
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String date = request.getParameter("date");
		String password = request.getParameter("password");
		String photo = request.getParameter("photo");
		
		
		//out.println("ID: "+id+"\nUsername: "+username+"\nPhone: "+phone+"\nEmail: "+email);
		User user = new User(id,username,phone,email,address,Date.valueOf(date),password,photo);
		
		userDAO dao = new userDAOimpl();
		
		boolean saveUser = dao.saveUser(user);
		
		if(saveUser) {
			out.println("User Saved Successfully! :)");
			String destination = "/userreg.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}else {
			out.println("Try Again! :(");
			String destination = "/userreger.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
	}
		
}
