package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbUtil {
	
	static Connection conn = null;
	
	
	public static Connection getConnection()
	{
		if(conn == null)
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.150:3306/dac58?useSSL=false";
				conn=DriverManager.getConnection(url,"dac58","welcome");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		return conn;
	}

}
