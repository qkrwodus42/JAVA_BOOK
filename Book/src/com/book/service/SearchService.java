package com.book.service;

import java.util.Collections;
import java.util.Comparator;

import com.book.book.Book;
import com.book.data.DummyDatas;
import com.book.global.AppUI;
import com.book.global.GlobalVariables;
import com.book.global.Start;

public class SearchService implements Start, GlobalVariables {
	
	@Override
	public void start() {
		while(true){		
			AppUI.searchingScreen();
			int selection = AppUI.InputInteger();
			
			switch(selection) {
				case titleSection: //1. 책 이름으로 조회하기
					searchByTitle();
					break;
				case publisherSection: //2. 출판사 이름으로 작성하기
					searchByPublisher();
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

	
	private void searchByTitle() {
		System.out.println("검색할 이름을 적어주세요");
		String inputWord = AppUI.InputString();

		
		for (int i = 0; i < DummyDatas.books.size(); i++) {
			if (DummyDatas.books.get(i).getTitle().contains(inputWord)){
				System.out.println(DummyDatas.books.get(i));
			}
		}
	}
	
	private void searchByPublisher() {
		System.out.println("검색할 이름을 적어주세요");
		String inputWord = AppUI.InputString();
		
		for (int g = 0; g < DummyDatas.books.size(); g++) {
			if (DummyDatas.books.get(g).getPublisher().contains(inputWord)) {
				System.out.println(DummyDatas.books.get(g));
			}
		}
	}

}
