package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;
import dao.contactDAO;
import dao.implement.contactDAOimpl;

@WebServlet("/regcontact")
public class ContactControl extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("name");
		String email = request.getParameter("email");
		long phone = Long.parseLong(request.getParameter("phone"));
		String message = request.getParameter("message");
		int contact_id = Integer.parseInt(request.getParameter("contact_id"));
		
		Contact contact = new Contact(id,username,email,phone,message,contact_id);
		
        contactDAO dao = new contactDAOimpl();
		
		boolean saveContact = dao.saveContact(contact);
		
		if(saveContact) {
			out.println("Contact Saved Successfully! :)");
		}else {
			out.println("Try Again! :(");
	}
	
}
}
