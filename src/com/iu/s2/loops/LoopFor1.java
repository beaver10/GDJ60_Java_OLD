package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("반복문 횟수를 입력하세요");
		
		int count = sc.nextInt();
		
		//int a=5;
		//초기식을 밖으로 빼놓으면 for 문 안에 안써도 된다
		//for(;a>0;a--) {
		
		//입력된 횟수만큼 회전
		
		
		int i=0;
		for(i=0;i<count;i++) {
			System.out.println("Hello World");
			System.out.println("Good Bye");	
			System.out.println(i);
		}
		
		
	
		System.out.println("Finish");
	}

}
