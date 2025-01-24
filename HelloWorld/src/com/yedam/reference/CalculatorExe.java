package com.yedam.reference;

public class CalculatorExe {

	public static void main(String[] args) {

		Book[] bookRepository = new Book[5];

		bookRepository[0] = new Book("수학의 정석", "김교수", "꿈나무", 25000);
		bookRepository[1] = new Book("영어의 정석", "박교수", "꿈나무", 30000);
		bookRepository[2] = new Book("JAVA 초급", "이교수", "해와달", 18000);
		bookRepository[3] = new Book("JAVA 중급", "이교수", "해와달", 28000);
		bookRepository[4] = new Book("JAVA 고급", "이교수", "해와달", 40000);

		Calculator cal = new Calculator();
		int[] ary1 = { 14, 23, 11, 14, 24 };
		int[] ary2 = { 33, 23, 6, 12, 9 };

//		cal.printStar(3, "○△□");

//		int result = cal.sum(5, 10);
//		double result2 = cal.sum(5.5, 10.1);
//		result2 = cal.sum(new int[] {2, 3, 4, 5});
//		
//		System.out.println("결과: " + result2);
		cal.printStar(5);
//		cal.printStar2(5);

//		System.out.println(cal.getMax(ary1, ary2));
//		System.out.println(cal.getMax(cal.sum(ary1), cal.sum(ary2)));

//		int[] randomA = cal.randomAry(5);
//		for (int num : randomA) {
//			System.out.println(num);
//		}

//		System.out.println(cal.sum(randomA));

		Book book = cal.getBookInfo("수학의 정석", bookRepository);

		book.printInfoDetail();

		System.out.println(cal.getBookInfo("수학의 정석", bookRepository) instanceof Book);

	}
}
