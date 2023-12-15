package com.demo.service;


import java.util.List;

import com.demo.beans.user;
import com.demo.dao.userDao;
import com.demo.dao.userDaoImpl;

public class userServiceImpl implements userService {

	userDao udao;
	public userServiceImpl() {
		
		udao = new userDaoImpl();
	}
	
	@Override
	public boolean register(String userName, String passWord) {
		// TODO Auto-generated method stub
		return udao.save(userName,passWord);
	}

	@Override
	public user findUser(String uname, String pass) {
		// TODO Auto-generated method stub
		return udao.authenticateUser(uname,pass);
	}

	@Override
	public List<user> getUserData() {
		
		return null;
	}





}
