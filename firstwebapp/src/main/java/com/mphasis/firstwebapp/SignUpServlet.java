package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String email = req.getParameter("email");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if (email.contains("gmail")) {
			RequestDispatcher rd = req.getRequestDispatcher("failurepage.html");
			rd.forward(req, resp); 
		}

else {
            out.println("<h2><b>Thank You</b> for signup</h2>");
        }

		
		
		out.println("<h3> Full Name: " + fname + " </h3>");
		out.println("<h4> Email : " + email + " </h4>");

	}

}
