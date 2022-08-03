package com.test;

public class App {

	public int userLogin(String user,String pass) {
		
		//ResourceBundle rb=ResourceBundle.getBundle("config");
		String userName="admin";//rb.getString("username");
		String password="admin"; //rb.getString("password");
		
		if(user.equals(userName) && pass.equals(password))
			return 1;
		else 
			return 0;
	}
	
}
