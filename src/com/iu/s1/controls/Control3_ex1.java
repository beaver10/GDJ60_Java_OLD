package com.iu.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//Game : TRPG
		//법사 
		String name = "비버";
		int hp=20;
		int mp=20;
		int hp1=0;
		int mp1=0;
		
		String monsterName ="요코";
		int monsterHp=10;
		
		System.out.println("1.hp보충   " + "2.mp보충   "+ "3.에너지볼트   "+ "4.매직클로   "+ "5.턴종료");
		int select = sc.nextInt();
				
			if(select==1) {
				int h =random.nextInt(41);
				System.out.println("hp가 충전되었습니다 +"+h);
				hp = hp+h; // 20+10=> 30 가능 / 20+30=>50 불가능 조건은 최대가 40이기때문에
				if(hp>=40) {
					hp=40;
					System.out.println("최대 체력이 충전되었습니다");
				}
				System.out.println("현재 hp : " +hp);
				
			}else if(select==2) {
				int m =random.nextInt(41);
				System.out.println("mp가 충전되었습니다 +"+m);
				mp = mp+m;
				if(mp>=40) {
					mp=40;
					System.out.println("최대 마나가 충전되었습니다");
				}
				System.out.println("현재 mp : "+mp);
				
			}else if(select==3) {
				System.out.println("에너지볼트 공격!");
				int skill1 = random.nextInt(6);
				System.out.println("데미지 : " + skill1);
				mp=mp-3;
				monsterHp = monsterHp - skill1;
				//주문을 외운다
				//mp가 3씩 감소
				//0~5이하의 수치를 공격
				System.out.println("남은 mp : " + mp);
				System.out.println("몬스터 hp : " + monsterHp);
				
				
			}else if(select==4) {
				System.out.println("매직클로 공격!");
				int skill2 = random.nextInt(11);
				System.out.println("데미지 : " + skill2);
				mp=mp-5;
				monsterHp = monsterHp - skill2;
				//주문을 외운다
				//mp가 5씩 감소
				//0~10이하의 수치를 공격
				System.out.println("남은 mp : " + mp);
				System.out.println("몬스터 hp : " + monsterHp);
			
				
				
			}else {
				System.out.println("턴을 넘깁니다");
				
			}

			
			

			System.out.println("-------------------------");
			System.out.println("결투가 끝났습니다.");
			System.out.println("사용자 이름: " + name);
			System.out.println("사용자 hp: " + hp + "  | 사용자 mp: " + mp);
			System.out.println("몬스터 이름: " + monsterName);
			System.out.println("몬스터 hp: " + monsterHp);
			
		
		//사용자의 이름과 hp, mp 출력
		//몬스터의 이름과 hp 출력
		
		
		
		
		
		
		
		
		/*
		
		int turn1 = random.nextInt(4);
		System.out.println(turn1);
		if(turn1==1) {
			hp1 = random.nextInt(41);
			System.out.println("hp충전 : " + hp1);

				if(hp1>=20) {
					System.out.println("hp : "+40);
					hp=hp+hp1;
				}else if(hp+hp1>40){
						System.out.println("총hp : 40");
				}
				else {
					System.out.println("총 hp : "+(hp+hp1));
				}
					
						
				
		}else if(turn1==2) {
			mp1 = random.nextInt(41);
			System.out.println("mp충전 : "+ mp1);
				if(mp1>20) {
					System.out.println("mp : "+40);
					mp=mp+mp1;
				}else if(mp+mp1>41) {
						System.out.println("총 mp : 40");
				}else {
						System.out.println("총 mp : "+(mp+mp1));
					}
			
		}else if(turn1==3 ) {
			System.out.println("에너지볼트");
		}else if(turn1==4) {
			System.out.println("매직클로");
		}else {
			System.out.println("턴을 넘긴다");
		}
		
		
		
		
		//1.HP보충(포션) 2.MP보충(포션) 3.에너지볼트(공격1) 4.매직클로(공격2) 5.턴을 넘긴다
		//HP, MP는 최대 40이 끝
		//보충시 랜덤하게 0~40 사이의 숫자를 받아서 HP,MP에 더하기
		
		//int test = random.nextInt(5); // 0~5미만의 정수하나를 리턴
		//int test2 = random.nextInt(30); 
		//System.out.println("test : "+test);
		//System.out.println("test2 : "+test2);
		
		*/
	}

}
