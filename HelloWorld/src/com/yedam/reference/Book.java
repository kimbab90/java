package com.yedam.reference;

public class Book {
	
	// public, protected, default, private

	// field

	private String bookTitle;
	private String bookWriter;
	private String bookCompany;
	private int bookPrice;

	// constructor
	Book() {

	}

	Book(String bookTitle, String bookWriter, String bookCompany, int bookPrice) {
		setBookTitle(bookTitle);
		setBookWriter(bookWriter);
		setBookCompany(bookCompany);
		setBookPrice(bookPrice);
	}

	// method

	void printInfo() {
		System.out.printf("제목: %s, 저자: %s, 출판사: %s, 가격: %d\n", bookTitle, bookWriter, bookCompany, bookPrice);
	}

	void printInfoDetail() {
		System.out.println("==============================");
		System.out.printf("제목: %s\n", bookTitle);
		System.out.printf("저자: %s\n", bookWriter);
		System.out.printf("출판사: %s\n", bookCompany);
		System.out.printf("가격: %d\n", bookPrice);
		System.out.println("==============================");
	}

	String getInfo() {
		return "제목: " + bookTitle + " 저자: " + bookWriter + " 출판사: " + bookCompany + " 가격: " + bookPrice;
	}

	// getter, setter

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public String getBookCompany() {
		return bookCompany;
	}

	public void setBookCompany(String bookCompany) {
		this.bookCompany = bookCompany;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		if (bookPrice < 0) {
			this.bookPrice = 0;
		} else {
			this.bookPrice = bookPrice;
		}
	}
}
