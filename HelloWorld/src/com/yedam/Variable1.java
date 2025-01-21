package com.yedam;

public class Variable1 {

	public static void main(String[] args) {
		// int 4byte
		int intNum = 111;
		byte byteNum = 27; // 1byte
		short shortNum = 1271; // 2byte
		long longNum = 9223372036854775807L; // 8byte

		System.out.println(Long.MAX_VALUE);

		byte num1 = 20;
		int byteResult = (byte) (byteNum + num1); // Casting
		int intResult = intNum + byteNum; // Promotion

		//
		int[] intArray = { 10, 25, 82, 11 };
		int sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}

		System.out.println(sum);
		
		String[] strArray = { "홍길동", "이순신", "강감찬"};
//		strArray[3] = "권율";
		
		int[] intArray2 = new int[10];
		System.out.println(intArray2);
		
		for (int i = 1; i < intArray2.length; i++) {
			intArray2[i] =(int) (Math.random() * 100) + 1;
			System.out.println(intArray2[i]);
		}
		
//		for (int num: intArray2) {
//			System.out.println(num);
//		}
		
	}
}