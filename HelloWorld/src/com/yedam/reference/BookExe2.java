package com.yedam.reference;

import java.util.Scanner;

/*
 * 도서명
 * 저자
 * 출판사
 * 판매가격
 * 
 * 1. 전체목록
 * 2. 도서등록
 * 3. 조회 (출판사)
 * 4. 
 * 
 * 
 * 9. 종료
 * 
 */

public class BookExe2 {

	public static void main(String[] args) {

		Book[] bookRepository = new Book[100];

		bookRepository[0] = new Book("수학의 정석", "김교수", "꿈나무", 25000);
		bookRepository[1] = new Book("영어의 정석", "박교수", "꿈나무", 30000);
		bookRepository[2] = new Book("JAVA 초급", "이교수", "해와달", 18000);
		bookRepository[3] = new Book("JAVA 중급", "이교수", "해와달", 28000);
		bookRepository[4] = new Book("JAVA 고급", "이교수", "해와달", 40000);
		bookRepository[4] = new Book("객체 프로그래밍", "이교수", "여명", 40000);

		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		while (run) {

			System.out.println("1.전체목록 2.도서등록. 3.조회(출판사) 9.종료");
			System.out.println("메뉴를 선택하세요!");
			int menu = Integer.parseInt(scanner.nextLine());

			switch (menu) {
			case 1:
				System.out.println("============================================================");
				for (Book book_print : bookRepository) {
					if (book_print != null) {
						book_print.printInfo();
					}
				}
				System.out.println("============================================================");
				break;
			case 2:
				System.out.println("제목을 입력하세요!");
				String bookTitle_in = scanner.nextLine();

				System.out.println("저자를 입력하세요!");
				String bookWriter_in = scanner.nextLine();

				System.out.println("출판사를 입력하세요!");
				String bookCompany_in = scanner.nextLine();

				System.out.println("가격을 입력하세요!");
				int bookPrice_in = Integer.parseInt(scanner.nextLine());

				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] == null) {
						bookRepository[i] = new Book(bookTitle_in, bookWriter_in, bookCompany_in, bookPrice_in);
						break;
					}
				}
				break;
			case 3:
				System.out.println("1.제목 2.저자 3.출판사");
				System.out.println("조회 기준을 선택하세요!");
				int menu_search = Integer.parseInt(scanner.nextLine());

				if (menu_search == 1 || menu_search == 2 || menu_search == 3) {
					System.out.println("조회할 값을 입력하세요!");
					String input_search = scanner.nextLine();
					String value_search = null;

					for (Book book_search : bookRepository) {
						switch (menu) {
						case 1:
							value_search = book_search.getBookTitle();
							break;
						case 2:
							value_search = book_search.getBookWriter();
							break;
						case 3:
							value_search = book_search.getBookCompany();
							break;
						}
						if (book_search != null && value_search != null && input_search.equals(value_search)) {
							book_search.printInfo();
						}
					}
				} else {
					System.out.println("입력이 잘못되었습니다!");
				}

//				String bookCompany_search;
//
//				switch (menu_search) {
//				case 1:
//					System.out.println("조회할 제목을 입력하세요!");
//					bookCompany_search = scanner.nextLine();
//					for (Book book_search : bookRepository) {
//						if (book_search != null && bookCompany_search.equals(book_search.bookTitle)) {
//							book_search.printInfo();
//						}
//					}
//					break;
//				case 2:
//					System.out.println("조회할 저자를 입력하세요!");
//					bookCompany_search = scanner.nextLine();
//					for (Book book_search : bookRepository) {
//						if (book_search != null && bookCompany_search.equals(book_search.bookWriter)) {
//							book_search.printInfo();
//						}
//					}
//					break;
//				case 3:
//					System.out.println("조회할 출판사를 입력하세요!");
//					bookCompany_search = scanner.nextLine();
//					for (Book book_search : bookRepository) {
//						if (book_search != null && bookCompany_search.equals(book_search.bookCompany)) {
//							book_search.printInfo();
//						}
//					}
//					break;
//				default:
//					System.out.println("입력이 잘못되었습니다!");
//				}
				break;
			case 9:
				System.out.println("종료합니다!");
				run = false;
				break;
			default:
			} // switch
		} // while
		scanner.close();
	} // main
} // class
