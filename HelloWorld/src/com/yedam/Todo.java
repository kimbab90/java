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
				balance += scn.nextInt();
			} else if (num == 2) {
				System.out.println("출금할 금액을 입력하세요>");
				balance -= scn.nextInt();
			} else if (num == 3) {
				System.out.printf("잔액은 %d원입니다\n", balance);
			} else if (num == 4) {
				System.out.println("종료합니다>");
				break;
			}
		}

		scn.close();
	}
}
