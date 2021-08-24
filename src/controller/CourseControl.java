package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.courseDAO;
import dao.implement.courseDAOimpl;
import model.Course;

@WebServlet("/regcourse")
public class CourseControl extends HttpServlet {

	@Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		PrintWriter out = response.getWriter();
		
		int cid = Integer.parseInt(request.getParameter("course_id"));
		String cname = request.getParameter("course_name");
		String description = request.getParameter("c_desc");
		String fees = request.getParameter("c_fees");
		String resources = request.getParameter("c_resources");
		
		Course course = new Course(cid,cname,description,fees,resources);
		
        courseDAO dao = new courseDAOimpl();
		
		boolean saveCourse = dao.saveCourse(course);
		
		if(saveCourse) {
			out.println("Course Saved Successfully! :)");
			String destination = "/coursein.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}else {
			out.println("Try Again! :(");
	}
	
}
}
