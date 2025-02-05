package com.yedam.inheritance;

public class Friend {

	private String friendName;
	private String phoneNumber;
	private BloodType btype;
	
	public Friend() {
//		super();
	}

	public Friend(String friendName, String phoneNumber) {
//		super();
		this.friendName = friendName;
		this.phoneNumber = phoneNumber;
	}
	
	public String showInfo() {
		return "==========\n이름 : " + friendName + "\n연락처 : " + phoneNumber;
	}

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BloodType getBtype() {
		return btype;
	}

	public void setBtype(BloodType btype) {
		this.btype = btype;
	}
}
