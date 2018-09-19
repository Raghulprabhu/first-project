package com.project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public First() {
        super();
            }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String s=request.getParameter("data");
		String t=request.getParameter("values");
		
		request.setAttribute("one", s);
		request.setAttribute("two", t);
		RequestDispatcher rd =request.getRequestDispatcher("Two.jsp");
		rd.forward(request, response);
	}
	
	//PrintWriter write = response.getWriter();
	//write.print("<h1>"+s+"</h1>");
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
