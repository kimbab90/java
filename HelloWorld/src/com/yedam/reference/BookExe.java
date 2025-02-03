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
 * 9. 종료
 * 
 */

public class BookExe {

	static Book[] bookRepository = new Book[100];

	static Scanner scanner = new Scanner(System.in);

	// 초기화
	public static void init() {
		bookRepository[0] = new Book("수학의 정석", "김교수", "꿈나무", 25000);
		bookRepository[1] = new Book("영어의 정석", "박교수", "꿈나무", 30000);
		bookRepository[2] = new Book("JAVA 초급", "이교수", "해와달", 18000);
		bookRepository[3] = new Book("JAVA 중급", "이교수", "해와달", 28000);
		bookRepository[4] = new Book("JAVA 고급", "이교수", "해와달", 40000);
		bookRepository[4] = new Book("교육학개론", "최교수", "여우비", 40000);
	}

	// 전체목록

	public static void printList() {
		System.out.println("============================================================");
		for (Book bookPrint : bookRepository) {
			if (bookPrint != null) {
				bookPrint.printInfo();
			}
		}
		System.out.println("============================================================");
	}

	// 도서목록

	public static void addBook() {
		System.out.println("제목을 입력하세요!");
		String bookTitleIn = scanner.nextLine();

		System.out.println("저자를 입력하세요!");
		String bookWriterIn = scanner.nextLine();

		System.out.println("출판사를 입력하세요!");
		String bookCompanyIn = scanner.nextLine();

		System.out.println("가격을 입력하세요!");
		int bookPriceIn = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] == null) {
				bookRepository[i] = new Book(bookTitleIn, bookWriterIn, bookCompanyIn, bookPriceIn);
				System.out.println("등록되었습니다!");
				break;
			}
		}
	}

	// 조회(출판사)

	public static void searchList() {
		System.out.println("조회할 출판사를 입력하세요!");
		String bookCompanySearch = scanner.nextLine();
		for (Book bookSearch : bookRepository) {
			if (bookSearch != null && bookCompanySearch.equals(bookSearch.getBookCompany())) {
				bookSearch.printInfo();
			}
		}
	}

	// 가격수정

	public static void modifyBook() {
		System.out.println("조회할 제목을 입력하세요!");
		String bookTitleSearch = scanner.nextLine();
		System.out.println("변경할 가격을 입력하세요!");
		int bookPriceChange = Integer.parseInt(scanner.nextLine());

		int countChange = 0;

		for (Book bookSearch : bookRepository) {
			if (bookSearch != null && bookTitleSearch.equals(bookSearch.getBookTitle())) {
				bookSearch.setBookPrice(bookPriceChange);
				bookSearch.printInfo();
				countChange++;
				break;
			}
		}

		if (countChange == 0) {
			System.out.println("입력한 제목과 일치하는 도서가 없습니다.");
		}
	}

	// 상세조회(제목)

	public static void showDetail() {
		System.out.println("조회할 제목을 입력하세요!");
		String bookTitleDetail = scanner.nextLine();

		Calculator cal = new Calculator();
		Book bookInfo = cal.getBookInfo(bookTitleDetail, bookRepository);
		bookInfo.printInfoDetail();

//		for (Book bookSearch : bookRepository) {
//		if (bookSearch != null && bookTitleDetail.equals(bookSearch.getBookTitle())) {
//			bookSearch.printInfoDetail();
//			break;
//		}
//	}
	}

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.showCalendar(6, 28);

//		init();
//
//		boolean run = true;
//
//		while (run) {
//			System.out.println("1.전체목록 2.도서등록. 3.조회(출판사) 4.가격수정 5.상세조회(제목) 9.종료");
//			System.out.println("메뉴를 선택하세요!");
//			int menu = Integer.parseInt(scanner.nextLine());
//
//			switch (menu) {
//			case 1:
//				printList();
//				break;
//			case 2:
//				addBook();
//				break;
//			case 3:
//				searchList();
//				break;
//			case 4:
//				modifyBook();
//				break;
//			case 5:
//				showDetail();
//				break;
//			case 9:
//				System.out.println("종료합니다!");
//				run = false;
//				break;
//			default:
//			} // switch
//		} // while
//		scanner.close();
	} // main
} // class
