package com.demo.service;

import java.util.List;

import com.demo.beans.user;

public interface userService {

	boolean register(String userName, String passWord);

	user findUser(String uname, String pass);

	List<user> getUserData();


}
