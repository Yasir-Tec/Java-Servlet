package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static Connection conn;
	
	public static Connection getMyConnection()
	{
		if(conn==null)
		{
			try 
			{
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.150:3306/dac58?useSSL=false";
				conn=DriverManager.getConnection(url, "dac58", "welcome");
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		
			
		}
		return null;
	}
	
	public void closeMyConnection() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
