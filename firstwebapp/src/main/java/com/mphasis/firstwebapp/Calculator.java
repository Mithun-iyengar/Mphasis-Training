package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		double num1 = Double.parseDouble(req.getParameter("num1"));
		double num2 = Double.parseDouble(req.getParameter("num2"));
		String op = req.getParameter("operation");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		double result = 0;

		switch (op) {
		case "add":
			result = num1 + num2;
			break;

		case "sub":
			result = num1 - num2;
			break;

		case "mul":
			result = num1 * num2;
			break;

		case "div":
			if (num2 == 0) {
				out.println("<h3>Error: Cannot divide by zero!</h3>");
				return;
			}
			result = num1 / num2;
			break;
		}

		out.println("<h2>Calculation Result: " + result + "</h2>");
	}
}