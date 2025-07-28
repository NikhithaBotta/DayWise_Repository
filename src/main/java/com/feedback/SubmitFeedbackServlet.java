package com.feedback;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class SubmitFeedbackServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");
        String feedback = request.getParameter("feedback");

        if (name.isEmpty() || email.isEmpty() || course.isEmpty() || feedback.isEmpty()) {
            request.setAttribute("error", "Please fill in all the fields.");
            request.getRequestDispatcher("/WEB-INF/feedback.jsp").forward(request, response);
            return;
        }

        HttpSession session = request.getSession();
        if (session.getAttribute("submitted") != null) {
            request.setAttribute("error", "You have already submitted feedback.");
            request.getRequestDispatcher("/WEB-INF/feedback.jsp").forward(request, response);
            return;
        }

        session.setAttribute("submitted", true);

        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("course", course);
        request.setAttribute("feedback", feedback);

        request.getRequestDispatcher("/WEB-INF/confirmation.jsp").forward(request, response);
    }
}
