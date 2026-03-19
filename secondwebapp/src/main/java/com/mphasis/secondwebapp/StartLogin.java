package com.mphasis.secondwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/startlogin")
public class StartLogin extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		PrintWriter out = resp.getWriter(); // ✅ FIXED

		if (req.getSession().getAttribute("user") == null) {
			RequestDispatcher rd = req.getRequestDispatcher("loginform.html");
			rd.forward(req, resp);
		} else {
			out.println("<h3>Already logged in...</h3>");
		}
	}
}