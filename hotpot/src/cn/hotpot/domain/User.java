package cn.hotpot.domain;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable{
	private String userName;
	
	private String userPassword;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	


	

}
