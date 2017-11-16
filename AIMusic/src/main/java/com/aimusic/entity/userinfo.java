package com.aimusic.entity;

public class userinfo {
private int infoId;
private String userName;
private String userProfile;
private String userSex;
private String userBirthday;
private String userAddress;
private String userAccount;
public int getInfoId() {
	return infoId;
}
public void setInfoId(int infoId) {
	this.infoId = infoId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserProfile() {
	return userProfile;
}
public void setUserProfile(String userProfile) {
	this.userProfile = userProfile;
}
public String getUserSex() {
	return userSex;
}
public void setUserSex(String userSex) {
	this.userSex = userSex;
}
public String getUserBirthday() {
	return userBirthday;
}
public void setUserBirthday(String userBirthday) {
	this.userBirthday = userBirthday;
}
public String getUserAddress() {
	return userAddress;
}
public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}
public String getUserAccount() {
	return userAccount;
}
public void setUserAccount(String userAccount) {
	this.userAccount = userAccount;
}
@Override
public String toString() {
	return "userinfo [infoId=" + infoId + ", userName=" + userName + ", userProfile=" + userProfile + ", userSex="
			+ userSex + ", userBirthday=" + userBirthday + ", userAddress=" + userAddress + ", userAccount="
			+ userAccount + "]";
}
public userinfo(int infoId, String userName, String userProfile, String userSex, String userBirthday,
		String userAddress, String userAccount) {
	super();
	this.infoId = infoId;
	this.userName = userName;
	this.userProfile = userProfile;
	this.userSex = userSex;
	this.userBirthday = userBirthday;
	this.userAddress = userAddress;
	this.userAccount = userAccount;
}
public userinfo() {
	super();
}


	
}
