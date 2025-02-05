package com.yedam.reference;

public class Student {
	// field

	String studentName;
	int engScore;
	int mathScore;
	Gender gender;

	// constructor

	Student() {

	}
	
	public Student(String studentName, int engScore) {
		this.studentName = studentName;
		this.engScore = engScore;
	}
	
	public Student(String studentName, int engScore, int mathScore) {
		this.studentName = studentName;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public Student(String studentName, int engScore, int mathScore, Gender gender) {
		this.studentName = studentName;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.gender = gender;
	}

	// method

	public void printInfo() {
		System.out.printf("이름은 %s, 영어점수는 %d, 수학점수는 %d, 성별은 %s\n", studentName, engScore, mathScore, gender);
	}
	
	double getAverage() {
		return ((double) engScore + mathScore) / 2;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
}
