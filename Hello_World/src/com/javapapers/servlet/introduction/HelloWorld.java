package com.javapapers.servlet.introduction;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		fgfg
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("Hello World!");
		out.println("This is from Servlet Class!");
		out.println("<br>");
		out.println("This is for testing from Batch file!");
		out.println("This is again for testing from Batch file!");
		out.println("This is again for testing from Batch file!");
		out.println("</body></html>");
		out.close();
	}
}
