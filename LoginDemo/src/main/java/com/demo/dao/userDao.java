package com.demo.dao;

import com.demo.beans.user;

public interface userDao {

	boolean save(String userName, String passWord);

	user authenticateUser(String uname, String pass);


}
