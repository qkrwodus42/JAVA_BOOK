package com.book.service;

import com.book.book.Book;
import com.book.data.DummyDatas;
import com.book.global.AppUI;
import com.book.global.GlobalVariables;
import com.book.global.Start;

public class SaveService implements Start, GlobalVariables{

	@Override
	public void start() {
		while(true){		
			AppUI.saveScreen();
			int selection = AppUI.InputInteger();
			
			switch(selection) {
				case saveNum: //1. 책 이름으로 조회하기
					saveNewBook();
					break;
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
	
	private void saveNewBook() {
		
		System.out.println("책의 이름을 입력해주세요");
		String inputTitle = AppUI.InputString();
		
		System.out.println("책의 출판사를 입력해주세요");
		String inputPublisher = AppUI.InputString();
		
		System.out.println("책의 가격을 입력해주세요");
		int inputPrice = AppUI.InputInteger();
		
		System.out.println("책의 출판 년도를 입력해주세요");
		int inputYear = AppUI.InputInteger();
		
		DummyDatas.books.add(new Book(inputTitle, inputPublisher, inputPrice, inputYear));
	}
	
}
