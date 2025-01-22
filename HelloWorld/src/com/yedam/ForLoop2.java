package com.yedam;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
//		String[] infoArray = "홍길동,80".split(",");

		Scanner scn = new Scanner(System.in);

		String[] studentAry = new String[100];
		boolean run = true;

		studentAry[0] = "백정현,80";
		studentAry[1] = "오승환,90";
		studentAry[2] = "원태인,75";

		while (run) {
			System.out.println("1. 전체입력 2. 최고점출력 3. 1명입력 4. 조회 9. 종료>");
			System.out.println("선택하세요.>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
//				for (int i = 0; i < studentAry.length; i++) {
//					System.out.println("입력하세요.");
//					String student = scn.nextLine();
//					studentAry[i] = student;
//				}
//				System.out.println("입력 완료.");
				break;
			case 2:
				int max = 0;
				String name = "";
				for (String item : studentAry) {
					if (item != null) {
						String[] studentInfo = item.split(",");
						int score = Integer.parseInt(studentInfo[1]);
						if (max < score) {
							max = score;
							name = studentInfo[0];
						}
					}
				}
				System.out.printf("최고 점수는%d이고, 해당 학생은 %s입니다.\n", max, name);
				break;
			case 3:
				System.out.println("입력하세요.");
				String student = scn.nextLine();

//				int count = 0;

				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] == null) {
						studentAry[i] = student;
						break;
					} else {
//						count++;
					}
				}

//				if (count == studentAry.length) {
//					System.out.println("입력할 공간이 부족합니다.");
//				} else {
//					System.out.println("입력 완료.");
//				}

				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) {
						System.out.printf("%d번 학생 정보: %s\n", i + 1, studentAry[i]);
					}
				}
				break;
			case 4:
				System.out.println("입력하세요.");
				String searchName = scn.nextLine();

//				boolean isEmpty = true;

				for (String item : studentAry) {
					if (item != null && searchName.equals(item.split(",")[0])) {
						System.out.printf("검색 결과: %s\n", item);
//						isEmpty = false;
						break;
					}
				}
//				if (isEmpty) {
//					System.out.printf("%s은/는 존재하지 않는 이름입니다\n", searchName);
//				}
				break;
			case 9:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}

			System.out.println("이름,점수를 입력>");
		} // while
		System.out.println("end of prog");

//		String userVal = scn.nextLine();
//		String[] userValAry = userVal.split(",");
//		System.out.printf("이름은 %s고, 점수는 %s점입니다.", userValAry[0], userValAry[1]);
	} // main
} // class
