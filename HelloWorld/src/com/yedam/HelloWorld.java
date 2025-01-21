package com.yedam;

// 객체 (object) 지향 언어. 
// class : 객체를 자바 언어로 정의.
// HelloWorld.java >> HelloWorld.class
public class HelloWorld {

	// method : 기능
	public static void main(String[] args) {
		System.out.println("Hello, World!");

		int myAge = 20;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("i의 값은 " + i);
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("sum의 값은 " + sum);
	}
}