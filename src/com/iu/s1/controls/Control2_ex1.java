package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//회원가입 할 때 입력한 ID, PW
		int id=1234;
		int pw=5678;

		//키보드로부터 id, pw를 입력받아서 로그인 처리
		
		System.out.println("아이디를 입력하세요");
		int yId = sc.nextInt();
		System.out.println("비밀번호를 입력하세요");
		int yPw = sc.nextInt();
		
		
		if(yId==id&&yPw==pw){
			System.out.println("로그인 성공");
			
		}else {
			System.out.println("로그인 실패");
		
		}
	}
}
