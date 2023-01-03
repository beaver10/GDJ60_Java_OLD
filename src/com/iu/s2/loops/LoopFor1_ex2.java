package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생수를 입력받고 
		//학생수만큼 점수를 입력받아서
		//총 합계를 출력
		
		
		
//		int i =0;
//		int sum =0;
//		
//		
//		System.out.println("학생수를 입력하세요");
//		int count =sc.nextInt(); //3
//		for(i=0;i<count;i++){
//			System.out.println("점수를 입력하세요");
//			int point = sc.nextInt();
//			sum=sum+point;
//			
//		}
//		
//	
//		System.out.println("총합계 : " +sum);
//		
		System.out.println("초를 입력하세요"); //초를 5 입력
		int sec = sc.nextInt();
		System.out.println(sec);
		
		int i=0;
		
		for(i=0;i<60;i++) { //고정
			System.out.println(i+"초");
			if(sec==i) {
				i=59;
			}
			
		}
		
		System.out.println("종료");
	}

}
