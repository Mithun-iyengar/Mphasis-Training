package com.mphasis.secondwebapp.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/resultservlet")
public class ReslutServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String msg = (String) req.getAttribute("msg");
		PrintWriter out = resp.getWriter();
		out.print("<h3>" + msg +"</h3>");
	}

}
