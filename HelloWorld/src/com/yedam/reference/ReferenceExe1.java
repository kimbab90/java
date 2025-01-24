package com.yedam.reference;

public class ReferenceExe1 {

	public static void main(String[] args) {
		int[] intArray;
		double[] doubleArray;
		String[] stringArray;
		doubleArray = new double[5];
		doubleArray = new double[] { 160.5, 174.6, 180.1 };

		// array[][];
		int[][] array = new int[2][3];
		array[0][0] = 10;
		array[0][1] = 20;
		array[0][2] = 30;
		array[1][0] = 20;
		array[1][1] = 30;
		array[1][2] = 40;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				System.out.println(array[j][i]);
			}
		}

	}

	public void method1() {
		System.out.println("method1");
	}

	private void method2() {
		System.out.println("method2");
	}

	public int sum(int num1, int num2) {
		return num1 + num2;
	}
}
