package com.aimusic.entity;

public class user {
private int userId;
private String userAccount;
private String userPwd;
private String userType;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserAccount() {
	return userAccount;
}
public void setUserAccount(String userAccount) {
	this.userAccount = userAccount;
}
public String getUserPwd() {
	return userPwd;
}
public void setUserPwd(String userPwd) {
	this.userPwd = userPwd;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
@Override
public String toString() {
	return "user [userId=" + userId + ", userAccount=" + userAccount + ", userPwd=" + userPwd + ", userType=" + userType
			+ "]";
}
public user(int userId, String userAccount, String userPwd, String userType) {
	super();
	this.userId = userId;
	this.userAccount = userAccount;
	this.userPwd = userPwd;
	this.userType = userType;
}
public user() {
	super();
}


}
