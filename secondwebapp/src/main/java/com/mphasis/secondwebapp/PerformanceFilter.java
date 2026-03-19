package com.mphasis.secondwebapp;

import java.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class PerformanceFilter implements jakarta.servlet.Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		long start = System.currentTimeMillis();

		chain.doFilter(req, res);
		long end = System.currentTimeMillis();
		HttpServletRequest hreq = (HttpServletRequest) req;
		System.out.println(
				"IP: " + hreq.getRemoteHost() + "," + hreq.getRequestURI() + "request completed ms:" + (end - start));

	}

}
