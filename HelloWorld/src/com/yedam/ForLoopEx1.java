package com.yedam;

import java.util.Scanner;

// 학생 점수 입력
// 총점, 최고 점수, 평균 출력

public class ForLoopEx1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int[] scores = new int[3];

		while (run) {
			System.out.println("1. 학생점수 입력, 2. 최고점수, 3. 평균점수, 4. 점수합계, 5. 종료");
			System.out.println("선택하세요.>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("점수를 입력하세요.>");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
				System.out.println("입력 완료.>");
				break;
			case 2:
				int max = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.printf("최고 점수는 %d점 입니다.\n", max);
				break;
			case 3:
				int sum = 0;
				double avg = 0;
				for (int score : scores) {
					sum += score;
				}
				avg = (double) sum / scores.length;
				System.out.printf("점수 합계는 %d점, 평균 점수는 %f점 입니다.\n", sum, avg);
				break;
			case 4:
			case 5:
				System.out.println("프로그램 종료.>");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.>");
			} // switch
		} // while
		System.out.println("end of prog");
	} // main
} // class
