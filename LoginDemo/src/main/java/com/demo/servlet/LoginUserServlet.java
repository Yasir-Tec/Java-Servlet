package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.user;
import com.demo.service.userService;
import com.demo.service.userServiceImpl;


@WebServlet("/login")
public class LoginUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		userService uservice = new userServiceImpl();
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		user us = uservice.findUser(uname,pass);
		
		if(us!=null) {
			out.println("you are "+us.getUsername());
			out.println("<table style='border:"1"'><th><td>username</td></th></table>");
		}
		else {
			out.println("Wrong credentials, pls renter");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request,response);
		}
		
		
	}

}
