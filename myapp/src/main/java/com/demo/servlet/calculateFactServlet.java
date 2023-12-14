package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calculateFactServlet extends HttpServlet
{
	public int factorial(int num)
	{
		int fact=1;
		if(num==1)
		{
			return num;
		}
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		return fact;
	}
	
	public int addition(int num1,int num2)
	{
		int sum = num1 + num2;
		return sum;
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		int num = Integer.parseInt(request.getParameter("num1"));
		String op = request.getParameter("btn");
		PrintWriter out = response.getWriter();
		
		System.out.println("id"+op);
		switch(op)
		{
		case "add":
			out.println("<center><h2><b>Result</b></h2></center>");
			System.out.println("hii");
			int num1 = Integer.parseInt(request.getParameter("num2"));
			int sum = addition(num, num1);
			out.println("<center><h3>Addition of : "+num+" and "+num1+" is : "+sum+"</h3></center>");
			break;
					
		case "fact":
			int getFactorial = factorial(num);
			out.println("<center><h3>Factorial of : "+num+" is : "+getFactorial+"</h3></center>");
			break;
		}
	}
}
