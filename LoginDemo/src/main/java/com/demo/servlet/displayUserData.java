package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.user;
import com.demo.service.userService;
import com.demo.service.userServiceImpl;

/**

 */
@WebServlet("/displayUserData")
public class displayUserData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public displayUserData() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		userService us=new userServiceImpl();
		List<user> userlist=us.getUserData();
		out.println("<table border='2'><tr><th>Username </th><th>Password</th></tr>");
		for(user p:userlist) {
			out.println("<tr><td>"+p.getUsername()+"</td><td>"+p.getPassword()+"</td></tr>");
			out.println("<td><a href='#'>delete</a> / <a href='#'>edit</a> </td> </tr>");
		}
		out.println("</table>");
		out.print("<a href='addproduct.html'>Add new Product</a>");
	}

}
