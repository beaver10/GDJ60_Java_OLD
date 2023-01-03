package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		//로그인 시도 총 5번 시도가능
		//반복문 종료 후 
		//로그인 성공 했으면 "환영합니다" 메세지 출력
		//모든 로그인 실패 했으면 "은행을 방문하세요" 메세지 출력
		int yId =0;
		int yPw =0;
		boolean check = false;
		int i = 0;
		for(i=0;i<5;i++) {
			System.out.print("아이디 입력 : ");
			yId = sc.nextInt();
			System.out.print("비밀번호 입력 : ");
			yPw = sc.nextInt();
			
			if(id == yId&&pw==yPw) {
				System.out.println("로그인성공");
				check = true;
				i=5;
			}else {
				System.out.println("로그인 실패");
			}	
		}
		if(i==5) {
			System.out.println("환영합니다");
		}else {
			System.out.println("은행을 방문하세요");
		}
		
		System.out.println("종료");
		
	}

}
