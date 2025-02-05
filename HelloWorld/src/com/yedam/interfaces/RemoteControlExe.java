package com.yedam.interfaces;

public class RemoteControlExe {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		System.out.println(RemoteControl.MAX_VALUE);
		rc = new Radio();
		rc.turnOn();
	}
}
