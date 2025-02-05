package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.reference.Gender;
import com.yedam.reference.Student;

public class Exe {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("김학생", 81, 90, Gender.MAN));
		students.add(new Student("이학생", 90, 78, Gender.WOMAN));
		students.add(new Student("박학생", 88, 89, Gender.WOMAN));
		students.add(new Student("최학생", 88, 89, Gender.MAN));

		for (int i = 0; i < students.size(); i++) {
			students.get(i).printInfo();
		}
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStudentName().equals("이학생")) {
				students.remove(i);
				break;
			}
		}
		
		System.out.println("-----------------------------------------------------------");
		
		for (int i = 0; i < students.size(); i++) {
			students.get(i).printInfo();
		}
 
//		for (Student item : students) {
//			item.printInfo();
//		}
//		

//		List<String> strList = new ArrayList<String>();
//		List<Friend> friends = new ArrayList<Friend>();
//
//		strList.add("11");
//		strList.add("22");
//		strList.add("33");
//		
//		friends.add(new Friend("11", "22"));
//		friends.add(new ComFriend("11", "22", "33", "44"));
//
//		System.out.println(strList.size());
//		
//		strList.remove(0);
//		
//		System.out.println(strList.size());
//		
//		for (int i = 0; i < strList.size(); i++) {
//			System.out.println(strList.get(i));
//		}
//		
//		for (int i = 0; i < friends.size(); i++) {
//			System.out.println(friends.get(i).showInfo());
//		}

	}
}