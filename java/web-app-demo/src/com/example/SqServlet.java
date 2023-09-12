package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = 0;
		Cookie cookies[] = req.getCookies();
		
		for (Cookie c : cookies) {
			if (c.getName().equals("k")) k = Integer.parseInt(c.getValue());
		}
		
//		HttpSession session = req.getSession();
		
//		int k = (int) session.getAttribute("k");
		
//		int k = Integer.parseInt(req.getParameter("k"));
		
		k = k * k;
		
		PrintWriter out = res.getWriter();
		out.println("Result: " + k); 			// <-- this is actually html code so you can actually print
												// 	   line by line to code a webpage but that's obviously 
												// 	   not feasible
	}
}
