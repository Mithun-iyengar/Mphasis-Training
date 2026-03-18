package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servletb")
public class ServletB extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String company = (String) req.getAttribute("company");
		String training = (String) req.getAttribute("training");
		String location = (String) req.getAttribute("location");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<h3> this is servlet B </h3>");
		out.print("<h3> Company :" + company + "</h3>");
		out.print("<h3> Training :" + training + "</h3>");
		out.print("<h3> location :" + location + "</h3>");
	}
}
