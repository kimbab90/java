package com.yedam;

import com.yedam.reference.ReferenceExe1;

public class ReferenceExe {

	public static void main(String[] args) {

		ReferenceExe1 ref1 = new ReferenceExe1(); // instance
		ref1.method1(); // public
//		ref2.method2(); // private
		
		ReferenceExe1.main(null); // public static 
		
		System.out.println(ref1.sum(11, 22));
	}
}