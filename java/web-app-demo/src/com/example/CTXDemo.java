package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CTXDemo extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
//		ServletContext ctx = getServletContext(); 			// wilder scope
		
		ServletConfig cg = getServletConfig();   			// servlet scope
		
//		String str = ctx.getInitParameter("pet");
		String str = cg.getInitParameter("pet");
		out.println(str);
	}
}
