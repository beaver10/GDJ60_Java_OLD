package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean check=true;
		
		while(check) {
			System.out.println("짜장 짬뽕 탕수육 끝");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("짜장");
				break;
			case 2:
				System.out.println("짬뽕");
				break;
			case 3:
				System.out.println("탕수육");
				break;
			default:
				System.out.println("종료");
				check=false;
			
			}System.out.println("프로그램을 종료합니다");
		
			
		}
		

	}

}



//MMORPG 게임
		//1. 로그인
		//2. 로그인 한 사용자만 게임 가능
		
		//--------로그인 파트---------
		//1.로그인 2. 종료
		// 1: id, pw 입력 후 로그인 판단
		// 2: 종료
		
		//-------게임 진행 파트--------
		//1. 로그인 성공 했을때 진행
		//레벨 1로 시작
		//초기 GOLD는 0
		//5렙 달성시 1000GOLD 지급
		//10렙 달성시 2000GOLD 지급
		//15렙 달성시 3000GOLD 지급
		//모든 몬스터의 경험치는 동일
		// 레벨 1->2 몬스터수 3마리
		// 레벨 2->3 몬스터수 6마리
		// 레벨 3->4 몬스터수 9마리
		// 레벨 4->5 몬스터수 12마리
		//....
		// 레벨 14->15 몬스터수 52마리
		//몬스터 사냥 성공마다 메시지 "몬스터 사냥 성공"
		//레벨업마다 축하 메세지 "축 레벨업"
		//만렙 달성 축하, 현재 GOLD 출력
		







