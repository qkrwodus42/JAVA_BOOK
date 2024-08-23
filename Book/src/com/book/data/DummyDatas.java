package com.book.data;

import java.util.ArrayList;

import com.book.book.Book;

public class DummyDatas {
	
	public static ArrayList<Book> books = new ArrayList<Book>();
	
	public static void InitializeData() {
		books.add(new Book("Mermaid", "A", 20000, 2004));
		books.add(new Book("SnowWhite", "B", 200000, 2006));
		books.add(new Book("Cinderella", "C", 13000, 2013));
		books.add(new Book("Aladin", "D", 40000, 2008));
		books.add(new Book("MickeyMouse", "B", 80000, 2023));
		books.add(new Book("DonaldDuck", "A", 120000, 2014));
		books.add(new Book("Rapunzel", "D", 100000, 2015));
		books.add(new Book("Mulan", "C", 90000, 2004));
		books.add(new Book("BeautyAndTheBeast", "D", 60000, 2000));
		books.add(new Book("Frozen", "A", 150000, 2020));
		
		
		
	}

}
