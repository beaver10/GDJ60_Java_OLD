package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//분과 초를 입력받아서
		//해당 분 초가 되면 반복문을 종료
		
		int b = 0;
		int s = 0;
		int min=0;
		int sec=0;
		boolean check=false;
		
		System.out.print("분 입력: ");
		min = sc.nextInt();
		System.out.print("초 입력: ");
		sec = sc.nextInt();
		
		for(b=0;b<60;b++) {
			
				for(s=0;s<60;s++) {
					System.out.println(b +" 분 " + s +" 초 ");
					if(min==b && sec==s) {
//						s=60;
//						b=60;
						check=true;
						break;
					}
				}//안쪽 for 끝
				if(check) {
					break;
				}
			
			
		}//바깥 for 끝

	}//main 끝

}
