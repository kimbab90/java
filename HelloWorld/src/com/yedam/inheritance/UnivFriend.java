package com.yedam.inheritance;

public class UnivFriend extends Friend {

	private String univName;
	private String univMajor;
	
	public UnivFriend() {
//		super();
	}
	
	public UnivFriend(String friendName, String phoneNumber, String univName, String univMajor) {
		super(friendName, phoneNumber);
		this.univName = univName;
		this.univMajor = univMajor;
	}
	
	@Override
	public String showInfo() {
		return super.showInfo() + "\n학교 : " + univName + "\n학과 : " + univMajor;
	}

	public String getUnivName() {
		return univName;
	}

	public void setUnivName(String univName) {
		this.univName = univName;
	}

	public String getUnivMajor() {
		return univMajor;
	}

	public void setUnivMajor(String univMajor) {
		this.univMajor = univMajor;
	}

}
