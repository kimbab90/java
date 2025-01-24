package com.yedam.reference;

public class Student {
	// field

	String studentName;
	int engScore;
	int mathScore;

	// constructor

	Student() {

	}
	
	Student(String studentName, int engScore) {
		this.studentName = studentName;
		this.engScore = engScore;
	}
	
	Student(String studentName, int engScore, int mathScore) {
		this.studentName = studentName;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	// method

	void printInfo() {
		System.out.printf("이름은 %s, 영어점수는 %d, 수학점수는 %d\n", studentName, engScore, mathScore);
	}
	
	double getAverage() {
		return ((double) engScore + mathScore) / 2;
	}
}
