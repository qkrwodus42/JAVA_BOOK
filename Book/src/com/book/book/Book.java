package com.book.book;

public class Book {
	private String title; //책 제목
	private String publisher; //책 출판사
	private int price; //책 가격
	private int year; //책 출판 연도
	
	public Book() {}
	
	public Book(String title, String publisher, int price, int year) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.price = price;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", publisher=" + publisher + ", price=" + price + ", year=" + year + "]";
	}
	
	
	

}
