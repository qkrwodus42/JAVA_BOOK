package com.book.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.book.book.Book;
import com.book.data.DummyDatas;
import com.book.global.AppUI;
import com.book.global.GlobalVariables;
import com.book.global.Start;

public class ListService implements Start, GlobalVariables{

	@Override
	public void start() {
		while(true){		
			AppUI.listScreen();
			int selection = AppUI.InputInteger();
			
			switch(selection) {
				case seeListNum: //1. 목록보기
					seeAllList();
					break;
				case seeByTitle: 
					orderByTitle();
					break;
				case seeByPrice: 
					orderByPrice();
					break;
				case reviseNum:
					reviseBook();
				case removeNum:
					removeBook();
				case returnSection:
					return; //메인화면으로 돌아가기	
				case terminateNum:  //프로그램 종료
					AppUI.Shutdown();
					break;	
				default:
					AppUI.DefaultMessages();		
			}
			AppUI.PressEnter();
			AppUI.InputString();
		}	
	}
	
	
	public void reviseBook() {
		seeAllList();
		while(true){	
			AppUI.reviseBookScreen();
			int selection = AppUI.InputInteger();			
			switch(selection) {
				case 1: 
					reviseTitle();
					break;
				case 2: 
					revisePrice();
					break;
				case 3:
					revisePublisher();
					break;
				case 4:
					reviseYear();
					break;
				case GlobalVariables.returnSection: 
					return; 			
				default:
					AppUI.DefaultMessages();	
			}
			AppUI.PressEnter();
			AppUI.InputString();
		}		
	}


	public static void seeAllList() {
		for (int i = 0; i < DummyDatas.books.size(); i++) {
			System.out.println(DummyDatas.books.get(i));
			
		}
		
	}
	
	private void orderByTitle() {
		Collections.sort(DummyDatas.books, new Comparator<Book>() {
			@Override
			public int compare(Book b1, Book b2) {
				return b1.getTitle().compareTo(b2.getTitle());
			}
		});
		
		for (Book book : DummyDatas.books) {
			System.out.println(book);
		}
	}
	
	private void orderByPrice() {
		Collections.sort(DummyDatas.books, new Comparator<Book>() {
			@Override
			public int compare(Book b1, Book b2) {
				return Double.compare(b1.getPrice(), b2.getPrice());
			}
		});
		
		for (Book book : DummyDatas.books) {
			System.out.println(book);
		}
	}
	
	private void reviseTitle() {
		orderByTitle();
		System.out.println("제목을 입력해주세요");
		String inputWord = AppUI.InputString();
		System.out.println("수정할 제목을 입력해주세요");
		String inputWord2 = AppUI.InputString();
		DummyDatas.books.stream()
			.filter(book -> book.getTitle().equals(inputWord))
			.findFirst()
			.ifPresent(book -> book.setTitle(inputWord2));
		
		DummyDatas.books.forEach(System.out::println);
		
	}
	
	
	private void revisePrice() {
		orderByTitle();
		System.out.println("제목을 입력해주세요");
		String inputWord = AppUI.InputString();
		System.out.println("수정할 가격을 입력해주세요");
		int inputNumber = AppUI.InputInteger();
		DummyDatas.books.stream()
			.filter(book -> book.getTitle().equals(inputWord))
			.findFirst()
			.ifPresent(book -> book.setPrice(inputNumber));
		
		DummyDatas.books.forEach(System.out::println);
		
	}
	
	private void revisePublisher() {
		orderByTitle();
		System.out.println("제목을 입력해주세요");
		String inputWord = AppUI.InputString();
		System.out.println("수정할 출판사를 입력해주세요");
		String inputWord2 = AppUI.InputString();
		DummyDatas.books.stream()
			.filter(book -> book.getTitle().equalsIgnoreCase(inputWord))
			.findFirst()
			.ifPresent(book -> book.setPublisher(inputWord2));
		
		DummyDatas.books.forEach(System.out::println);
		
	}
	
	private void reviseYear() {
		orderByTitle();
		System.out.println("제목을 입력해주세요");
		String inputWord = AppUI.InputString();
		System.out.println("수정할 출판 년도를 입력해주세요");
		int inputNumber = AppUI.InputInteger();
		DummyDatas.books.stream()
			.filter(book -> book.getTitle().equalsIgnoreCase(inputWord))
			.findFirst()
			.ifPresent(book -> book.setYear(inputNumber));
		
	
		

		DummyDatas.books.forEach(System.out::println);
	}
	
	
	
	
	
	private static void  removeBook() {
		seeAllList();
		System.out.println("삭제할 책의 체목을 입력해주세요");
		String inputWord = AppUI.InputString();
		
		Iterator<Book> iterator = DummyDatas.books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(inputWord)) {
                iterator.remove();
                break; 
            }
        }


        DummyDatas.books.forEach(System.out::println);
	}
}