package com.yedam.inheritance;

import java.util.Scanner;

public class FriendExe {

	private static FriendExe instance = new FriendExe();

	private FriendExe() {

	}

	public static FriendExe getInstance() {
		return instance;
	}

	Friend[] friends = new Friend[100];

	public void init() {

		friends[0] = new Friend("이친구", "7777");
		friends[1] = new UnivFriend("박학생", "9999", "예담", "간호");
		friends[2] = new ComFriend("김사원", "0000", "태왕", "대리");

	}

	Scanner scn = new Scanner(System.in);

	public void run() {

		init();

		boolean run = true;

		while (run) {

			System.out.println("=메인=");
			System.out.println("1.목록 2.등록 3.수정 4.삭제 9.종료");
			System.out.print("선택>>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				friendList();
				break;
			case 2:
				addFriend();
				break;
			case 3:
				editFriend();
				break;
			case 4:
				deleteFriend();
				break;
			case 9:
				System.out.println("=종료=");
				run = false;
				break;
			default:
				System.out.println("=오류=");
			}
		}
	}

	void friendList() {
		System.out.println("=목록=");
		
		boolean isExist = false;

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].showInfo());
				isExist = true;
			}
		}
		
		if (!isExist) {
			System.out.println("친구가 없습니다 (ㅠㅅㅜ)");
		}
	}

	void addFriend() {

		while (true) {

			System.out.println("=등록=");
			System.out.println("1.일반 2.학교 3.회사 4.종료");
			System.out.print("선택>>");

			int menu = Integer.parseInt(scn.nextLine());

			if (menu != 1 && menu != 2 && menu != 3 && menu != 4) {
				System.out.println("=오류=");
				continue;
			}

			if (menu == 4) {
				System.out.println("=종료=");
				return;
			}

			String name;

			while (true) {
				System.out.print("이름 : ");
				name = scn.nextLine();
				if (name.length() > 2 && name.length() < 10) {
					break;
				} else {
					System.out.println("이름은 3~9자");
				}
			}

			System.out.print("연락처 : ");
			String phone = scn.nextLine();

			Friend friend;

			if (menu == 1) {
				friend = new Friend(name, phone);

			} else if (menu == 2) {
				System.out.print("학교 : ");
				String univ = scn.nextLine();
				System.out.print("학과 : ");
				String major = scn.nextLine();

				friend = new UnivFriend(name, phone, univ, major);

			} else {
				System.out.print("회사 : ");
				String com = scn.nextLine();
				System.out.print("부서 : ");
				String dep = scn.nextLine();

				friend = new ComFriend(name, phone, com, dep);
			}

			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = friend;
					System.out.println("=등록완료=");
					break;
				}
			}
		}
	}

	void editFriend() {
		System.out.println("=수정=");
		
		System.out.print("이름 : ");
		String name = scn.nextLine();
		System.out.print("연락처(수정) : ");
		String phone = scn.nextLine();

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && name.equals(friends[i].getFriendName())) {
				friends[i].setPhoneNumber(phone);
				System.out.println("=수정완료=");
				break;
			}
		}
	}

	void deleteFriend() {
		System.out.println("=삭제=");
		
		System.out.print("이름 : ");
		String name = scn.nextLine();
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && name.equals(friends[i].getFriendName())) {
				friends[i] = null;
				System.out.println("=삭제완료=");
				break;
			}
		}
	}

}
