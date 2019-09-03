package org.ssm.mvn.dubbo.api.entity;

import java.io.Serializable;

public class UserEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8166228520954128144L;

	private Long uid;
	
	private String userName;
	
	private String password;

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
