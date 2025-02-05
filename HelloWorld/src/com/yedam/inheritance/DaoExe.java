package com.yedam.inheritance;

import java.util.Scanner;

public class DaoExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		MysqlDao dao = new MysqlDao();

		boolean run = true;

		while (run) {

			System.out.println("1.등록 2.삭제 3.조회 9.종료");
			System.out.print("선택>>");

			int menu = scn.nextInt();
			scn.nextLine();

			switch (menu) {
			case 1:
				dao.register();
				break;
			case 2:
				dao.remove();
				break;
			case 3:
				dao.search();
				break;
			case 9:
				break;
			}

		}
	}
}
