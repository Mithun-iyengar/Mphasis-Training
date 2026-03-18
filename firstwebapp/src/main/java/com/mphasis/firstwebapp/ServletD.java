package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servletd")
public class ServletD extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String database = (String) getServletContext().getAttribute("database");
		String login = (String) getServletContext().getAttribute("login");
		String password = (String) getServletContext().getAttribute("password");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<h3> this is servlet B </h3>");
		out.print("<h3> database :" + database + "</h3>");
		out.print("<h3> login :" + login + "</h3>");
		out.print("<h3> password :" + password + "</h3>");
	}
}
