package com.yedam;

import java.util.Scanner;

public class Todo {

	public static void main(String[] args) {
//		System.out.println("임의의 숫자를 입력: ");
//		
		Scanner scn = new Scanner(System.in);
//
//		int num = scn.nextInt();
//		
//		System.out.printf("입력한 값은 %d", num);

//		System.out.println("임의의 문자를 입력: ");
//
//		String str = scn.nextLine();
//		
//		int num = Integer.parseInt(str);
//		
//		System.out.printf("입력한 값은 %d\n", num);
//
//		System.out.printf("입력한 값은 %s", str);

		int balance = 0;

		while (true) {
			System.out.println("1: 입금, 2: 출금, 3: 잔액조회, 4: 종료");
			System.out.println("메뉴를 선택하세요>");

			int num = scn.nextInt();

			if (num == 1) {
				System.out.println("입금할 금액을 입력하세요>");
				int in = scn.nextInt();
				if ((balance + in) > 100000) {
					System.out.println("최대 예금액은 10만입니다>");
				} else {
					balance += in;
					System.out.println("입금 완료");
				}
				System.out.printf("현재 예금액은 %d입니다\n", balance);
			} else if (num == 2) {
				System.out.println("출금할 금액을 입력하세요>");
				int out = scn.nextInt();
				if ((balance - out) < 0) {
					System.out.println("예금액이 부족합니다>");
				} else {
					balance -= out;
					System.out.println("출금 완료");
				}
				System.out.printf("현재 예금액은 %d입니다\n", balance);
			} else if (num == 3) {
				System.out.printf("현재 예금액은 %d입니다\n", balance);
			} else if (num == 4) {
				System.out.println("종료합니다>");
				break;
			}
		}
	}
}
