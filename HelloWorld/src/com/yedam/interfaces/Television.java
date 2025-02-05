package com.yedam.interfaces;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV on!");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV off!");
	}

}
