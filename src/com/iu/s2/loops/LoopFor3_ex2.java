package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {

	public static void main(String[] args) {
		// 배그 총알 
		//30발 -> 1탄창
		//캐릭터당 -> 3탄창
		
		//1.단발
		//2.점사
		
		//1번이면 "탕" 30번 반복출력
		//2번이면 "탕탕탕" 10번 반복출력
		
		//총알을 다쓰면 탄창을 간다
		//다 쏘면 다시 단발, 점사인지 물어봄
		
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int t=1;t<4;t++){
			System.out.println("1. 단발 		2.점사");
			int select = sc.nextInt();
			int count =10;
			String sound="타타탕";
			
			if(select==1) {
				sound="탕";
				count=30;
				}
//			}else {
//				sound="탕탕탕";
//				count=10;
//			}
				for(int b=0;b<count;b++) {
					System.out.println(b+"번째 소리 : "+sound);
			
				
			}
			System.out.println("탄창하나 소비");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		내가 짠 코드
		
//		int b = 0;
//		int selcet1 = 1;
//		int selcet2 = 2;
//		int user = 0;
//		boolean check = false;
//		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("사격 시작");
//		for(int tan =0;tan<3;tan++) {
//			
//			System.out.println("1.단발	2.점사");
//			user = sc.nextInt();
//			
//			if(user==selcet1) {
//				System.out.println("단발을 골랐습니다");
//					for(b=0;b<30;b++) {
//						System.out.println("탕");
//					}System.out.println("탄창 소비 완료");
//					System.out.println("====================");
//				
//			}else {
//				System.out.println("점사를 골랐습니다");
//					for(b=0;b<10;b++) {
//						System.out.println("탕탕탕");
//					}System.out.println("탄창 소비 완료");
//					System.out.println("====================");
//			}
//			
//			
//			
//			
//			
//		}
//		System.out.println("사격 종료");
//		
		

	}

}
