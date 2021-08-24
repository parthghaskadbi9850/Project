package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.feedbackDAO;
import dao.implement.feedbackDAOimpl;
import model.Feedback;

@WebServlet("/feedback")
public class FeedbackControl extends HttpServlet{
	
	@Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("name");
		String email = request.getParameter("email");
		int feedback_id = Integer.parseInt(request.getParameter("f_id"));
		String fback = request.getParameter("feedback");
		
		
		Feedback feedback = new Feedback(id,username,email,feedback_id,fback);
		
        feedbackDAO dao = new feedbackDAOimpl();
		
		boolean saveFeedback = dao.saveFeedback(feedback);
		
		if(saveFeedback) {
			out.println("Feedback Saved Successfully! :)");
		}else {
			out.println("Try Again! :(");
	}
	
}

}
