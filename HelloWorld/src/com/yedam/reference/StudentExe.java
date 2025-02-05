package com.yedam.reference;

import java.util.Scanner;

public class StudentExe {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Student[] students = new Student[5];

		Student std1 = new Student("홍길동", 80, 85);
//		std1.studentName = "홍길동";
//		std1.engScore = 80;
//		std1.mathScore = 85;

		Student std2 = new Student();
		std2.studentName = "김민수";
		std2.engScore = 85;
		std2.mathScore = 88;
		std2.gender = Gender.MAN;

		Student std3 = new Student();
		std3.studentName = "홍정학";
		std3.engScore = 75;
		std3.mathScore = 90;
		std3.gender = Gender.WOMAN;

		students[0] = std1;
		students[1] = std2;
		students[2] = std3;
		students[3] = new Student("김민지", 88, 92);

		System.out.println("=====================================");
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].printInfo();
			}
		}
		System.out.println("=====================================");
		
		System.out.println("평균을 출력할 학생 이름 입력");
		String studName = scanner.nextLine();

		System.out.println("=====================================");
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && studName.equals(students[i].studentName)) {
				System.out.printf("%s 학생의 평균 점수는 %.2f\n", students[i].studentName, students[i].getAverage());
			}
		}
		System.out.println("=====================================");
		
//		for (int i = 0; i < students.length; i++) {
//			if (students[i] != null) {
//				students[i].printInfo();
//				System.out.printf("%s 평균 점수는 %.2f\n", students[i].getClass().getSimpleName(), students[i].getAverage());
//			}
//		}

	}

}
