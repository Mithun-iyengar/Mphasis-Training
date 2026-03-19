package com.mphasis.secondwebapp.service;

import java.util.HashMap;
import java.util.Map;

public class LoginService {
	private Map<String , String > users= new HashMap<>();
	public LoginService() {
	users.put("Tom","123");
	users.put("Jai","123");
	users.put("Jerry","123");
	}
	
	public boolean check(String login, String password) {
		if (login.equals("Tom") & password.equals("123"))
			return true;
		else
			return false;
	}

}
