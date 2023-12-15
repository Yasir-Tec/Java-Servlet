package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.userService;
import com.demo.service.userServiceImpl;


@WebServlet("/register")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		PrintWriter out=response.getWriter();
		
		userService uservice = new userServiceImpl();
		boolean status = uservice.register(userName,passWord);
		RequestDispatcher rd = request.getRequestDispatcher("login.html");
		out.println("Registered successfully, pls enter credentials");
		rd.include(request, response);
		

		
	}

}
