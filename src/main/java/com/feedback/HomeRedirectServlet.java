package com.feedback;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class HomeRedirectServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/feedback.jsp").forward(request, response);
    }
}
