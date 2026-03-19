package com.mphasis.secondwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/dbservlet")
public class Dbservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h3>" + getServletContext().getInitParameter("database") + "</h3>");
		out.println("<h3>" + getServletContext().getInitParameter("login") + "</h3>");
		out.println("<h3>" + getServletContext().getInitParameter("password") + "</h3>");

	}

}
