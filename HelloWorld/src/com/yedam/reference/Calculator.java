package com.yedam.reference;

public class Calculator {

	//

	public void showCalendar(int space, int max) {

		String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		for (String day : days) {
			System.out.printf("%5s", day);
		}
		System.out.println("\n=====================================");

//		int space = 3;
//		int max = 31;

		for (int i = 0; i < max + space; i++) {
			if (i < space) {
				System.out.printf("%5s", " ");
			} else if ((i + 1) % 7 == 0) {
				System.out.printf("%5d\n", (i + 1) - space);
			} else {
				System.out.printf("%5d", (i + 1) - space);
			}
		}

		String[] dateAry = new String[space + max];

		for (int i = 0; i < dateAry.length; i++) {
			if (i < space) {
				dateAry[i] = "";
			} else {
				dateAry[i] = "" + ((i + 1) - space);
			}
		}

		System.out.println("\n=====================================");

		for (int i = 0; i < dateAry.length; i++) {
			if ((i + 1) % 7 == 0) {
				System.out.printf("%5s\n", dateAry[i]);
			} else {
				System.out.printf("%5s", dateAry[i]);
			}
		}

//		int week = (empty + max) % 7 == 0 ? (empty + max) / 7 : (empty + max) / 7 + 1;   
//
//		System.out.println("\n=====================================");
//		for (int i = 0; i < week; i++) {
//			for (int j = 0; j < 7; j++) {
//				int day =  i * 7 + j;
//				if (day < empty) {
//					System.out.printf("%5s", " ");
//				} else if (day < max + empty){
//					System.out.printf("%5d", day + 1 - empty);
//				}
//			}
//			System.out.print("\n");
//		}
		System.out.println("\n=====================================");
	}

	//

	public Book getBookInfo(String bookTitle, Book[] bookRepository) {
		for (Book book : bookRepository) {
			if (book.getBookTitle().equals(bookTitle)) {
				return book;
			}
		}
		return null;
	}

	//

	public int[] randomAry(int n) {
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			result[i] = (int) (Math.random() * 100) + 1;
		}

		return result;
	}

	// max

	public int getMax(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}

	public int getMax(int[] numAry1, int[] numAry2) {
		int sum1 = sum(numAry1);
		int sum2 = sum(numAry2);
		return sum1 > sum2 ? sum1 : sum2;
	}

	// print
	public void printStar(int line) {
		for (int i = 0; i < line; i++) {
			printStar(i + 1, "*");
			System.out.println();
		}
	}

	public void printStar2(int line) {
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				if (i + j > line - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void printStar(int times, String types) {
		for (int i = 0; i < times; i++) {
			System.out.print(types);
		}
	}

	// sum - overloading

	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public double sum(double num1, double num2) {
		return num1 + num2;
	}

	public int sum(int[] numAry) {
		int sum = 0;
		for (int num : numAry) {
			sum += num;
		}
		return sum;
	}
}
