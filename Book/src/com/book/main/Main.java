package com.book.main;

import com.book.data.DummyDatas;
import com.book.global.AppController;
import com.book.global.AppUI;

public class Main {
	public static void main(String[] args) {
		
		
		
		
		
			DummyDatas.InitializeData();
			
			
			
			
			
			
			AppController controller = new AppController();
			
			
			
			while(true) {
				AppUI.startScreen(); 
				
				
				
				int inputNumber = AppUI.InputInteger();
				controller.chooseSystem(inputNumber);
				
				
			}
	}

}
