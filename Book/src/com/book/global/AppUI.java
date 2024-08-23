package com.book.global;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppUI {
	
	private static Scanner sc = new Scanner(System.in);

	//Messages
	public static void DefaultMessages() {
		System.out.println("# 메뉴를 다시 입력해주세요.");
	}
	
	public static void TerminateProgramMessages() {
		System.out.println("### 99999. 예매 프로그램 종료하기 ");
	}
	
	public static void PressEnter() {
		System.out.println("\n======계속 진행하시려면 ENTER를 누르세요======");
	}	
		
	//Usual Functions
	public static void Shutdown() {
		sc.close();
		System.exit(0);
	}
	
	public static String InputString() { //문자를 입력받는 곳에서 사용
		return sc.nextLine();
	}

	public static int InputInteger() { //숫자를 입력받는 곳에서 사용
		int inputNum = 0;
		try {
			inputNum = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("정수로 입력해 주세요.");
		} finally {
			sc.nextLine();
		}

		return inputNum;
	}


	// 0. 시작화면 출력(Main)
	public static void startScreen() {
		System.out.println("\n==========책 관리 시스템 ==========");
		System.out.println("### 1. 저장하기");
		System.out.println("### 2. 목록보기");
		System.out.println("### 3. 검색하기");		
		System.out.println("### 9. 메인 페이지로 돌아가기");		 
		TerminateProgramMessages();
		System.out.println("--------------------------------------");
		System.out.print(">>>");
	}
	
	public static void saveScreen() {
		System.out.println("\n==========저장 시스템 ==========");
		System.out.println("### 1. 새로운 책 저장하기");	
		System.out.println("### 9. 메인 페이지로 돌아가기");		 
		TerminateProgramMessages();
		System.out.println("--------------------------------------");
		System.out.print(">>>");
	}
	
	public static void listScreen() {
		System.out.println("\n==========목록 시스템 ==========");
		System.out.println("### 1. 전체 목록 보기");
		System.out.println("### 9. 메인 페이지로 돌아가기");		 
		TerminateProgramMessages();
		System.out.println("--------------------------------------");
		System.out.print(">>>");
	}
	
	
	
	// 검색
	public static void searchingScreen() {
		System.out.println("\n=========검색 시스템=========");
		System.out.println("### 1. 책 이름으로 조회하기");
		System.out.println("### 2. 출판사 이름으로 조회하기");
		System.out.println("### 9. 메인 페이지로 돌아가기");
		TerminateProgramMessages();
		System.out.println("----------------------------------------");
		System.out.print(">>> "); 
	}

}
