package com.yedam.inheritance;

public class ComFriend extends Friend {
	
	private String comName;
	private String department;
	
	public ComFriend() {
//		super();
	}
	
	public ComFriend(String friendName, String phoneNumber, String comName, String department) {
		super(friendName, phoneNumber);
		this.comName = comName;
		this.department = department;
	}
	
	@Override
	public String showInfo() {
		return super.showInfo() + "\n회사 : " + comName + "\n부서 : " + department;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
}
