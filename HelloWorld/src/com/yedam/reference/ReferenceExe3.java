package com.yedam.reference;

import java.util.Scanner;

public class ReferenceExe3 {

	public static void main(String[] args) {

		exe();

	} // main

	public static void exe() {

		String[][] friends = new String[100][3];
		friends[0][0] = "홍길동";
		friends[0][1] = "111111";
		friends[0][2] = "남";

		friends[1] = new String[] { "김민서", "222222", "여" };

		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		while (run) {

			System.out.println("1.목록, 2.입력, 3.조회(성별) 9.종료");
			System.out.println("선택하세요");

			int menu = Integer.parseInt(scanner.nextLine());

			switch (menu) {
			case 1:
//				for (String[] friend : friends) {
//					if (friend != null && friend[0] != null) {
//						System.out.printf("이름: %s, 전화번호: %s, 성별: %s\n", friend[0], friend[1], friend[2]);
//					}
//				}

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i][0] != null) {
						System.out.printf("이름: %s, 전화번호: %s, 성별: %s\n", friends[i][0], friends[i][1], friends[i][2]);
					}
				}
				break;
			case 2:
				System.out.println("이름 입력");
				String name_in = scanner.nextLine();
				System.out.println("전화번호 입력");
				String phone_in = scanner.nextLine();
				System.out.println("성별 입력");
				String gender_in = scanner.nextLine();
				
				for (int i = 0; i < friends.length; i++) {
					
				}

				break;
			case 3:
			case 9:
				System.out.println("종료합니다");
				run = false;
				break;
			default:
			} // switch
		} // while
	} // exe

} // class