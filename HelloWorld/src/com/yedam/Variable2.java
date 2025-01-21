package com.yedam;

public class Variable2 {

	public static void main(String[] args) {
//		int num = 5;

		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 7; i++) {
//				System.out.print(num + " * " + i  + " = " + i * num + "\n");

				System.out.printf("%1$d * %2$d = %3$2d ", i, j, j * i);

//				if (i == 6) {
//					System.out.printf("%2d * %2d = %2d\n", i, j, j * i);
//				} else {
//					System.out.printf("%1$d * %2$d = %3$2d ", i, j, j * i);
//				}
//				System.out.println(num + " * " + i  + " = " + i * num);
			}
			System.out.println();
		}

	}
}
