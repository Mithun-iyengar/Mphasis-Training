package com.mphasis.secondwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.websocket.Session;

@WebServlet("/counter")
public class HitCounter extends HttpServlet {
	int counter=0;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String id = req.getSession().getId();
		PrintWriter out = resp.getWriter();
		
		if (req.getSession().isNew()) {
			counter++;

		}
		
		out.print("<h3> session id :" + req.getSession().isNew() + "</h3"); // checks if session is new or not

		out.print("<h3> session id : " + id + "</h3");
		out.print("<h3> counter : " + counter + "</h3");  //if new user login counter get increses but not if refreshed
	}

}
