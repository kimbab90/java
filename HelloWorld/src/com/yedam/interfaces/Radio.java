package com.yedam.interfaces;

public class Radio implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Radio on!");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Radio off!");
	}

}
