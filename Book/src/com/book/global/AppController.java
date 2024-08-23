package com.book.global;

import com.book.service.ListService;
import com.book.service.SaveService;
import com.book.service.SearchService;

public class AppController {
	
	SaveService saveService = new SaveService();
	ListService listService = new ListService();
	SearchService searchService = new SearchService();
	
	public void chooseSystem(int inputNum) {		
		switch(inputNum) {  	
	    	
	    	case GlobalVariables.saveSection: 
	    		System.out.println("저장 모드로 돌입합니다.");
	    		saveService.start();
	    		break;
	    		
	    	
	    	case GlobalVariables.listSection:     
	    		System.out.println("목록 확인 모드로 돌입합니다."); 
	    		listService.start();
	    		break;
	    		
	    	
	    	case GlobalVariables.searchSection:     
	    		System.out.println("검색 모드로 돌입합니다."); 
	    		searchService.start();
	    		break;
	    		
	   
	    	case GlobalVariables.terminateNum:
	    		System.out.println("프로그램을 종료합니다.");
	    		AppUI.Shutdown();
	    		break;
	    		
	    	default:
	    		AppUI.DefaultMessages();
	    		break;
		}
	}
}
