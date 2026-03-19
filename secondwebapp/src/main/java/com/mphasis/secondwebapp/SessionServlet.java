package com.mphasis.secondwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String id = req.getSession().getId();
		PrintWriter out = resp.getWriter();
		out.print("<h3> session id :" + req.getSession().isNew() + "</h3"); //checks if session is new or not
		
		out.println("<h3> session id : " + id + "</h3");

	}
}
