package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.user;

public class userDaoImpl implements userDao{
	
	static Connection conn;
	static PreparedStatement insertuser,checkUser;
	
	static
	{
		conn=dbUtil.getConnection();
		try {
			insertuser=conn.prepareStatement("insert into user values(?,?);");
			checkUser=conn.prepareStatement("select username,password from user where username=? and password=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean save(String userName, String passWord) {
		
		try {
			insertuser.setString(1, userName);
			insertuser.setString(2, passWord);
			int n=insertuser.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return false;
	}

	@Override
	public user authenticateUser(String uname, String pass) {
		
		try {
			checkUser.setString(1, uname);
			checkUser.setString(2, pass);
			ResultSet rs=checkUser.executeQuery();
			if(rs.next()) {
				return new user(rs.getString(1),rs.getString(2));
				
			}}catch(SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			return null;
		
	}



}
