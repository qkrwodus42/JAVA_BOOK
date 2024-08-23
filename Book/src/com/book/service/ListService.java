package com.book.service;

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
	
	private void seeAllList() {
		for (int i = 0; i < DummyDatas.books.size(); i++) {
			System.out.println(DummyDatas.books.get(i));
			
		}
		
	}
}
