package edu.kh.control.practice;

import java.util.Scanner;

public class AtmSimulator2{
	
	Scanner sc = new Scanner(System.in);
	
	public void ex2() {
	
		int money = 10000;
		System.out.println("====ATM 프로그램 시작======");
		System.out.println("현재잔액: " + money);
		int num = 0;
	
		while (num !=4) {
				System.out.println("메뉴를 선택하세요:");
				System.out.println("1.입금하기");
				System.out.println("2.출금하기");
				System.out.println("3.잔액조회");
				System.out.println("4.종료");
				System.out.println(">>");
				num = sc.nextInt();
	
				switch(num) {
				case 1: 
					System.out.print("입금할 금액을 입력하세요");
					int input = sc.nextInt();
					money += input;
					System.out.println("입금완료! 현재 잔액: " + money);
					break;
				case 2:
					System.out.println("현재 잔액은 " + money);
					int output = sc.nextInt();
					if(money < output) {
						System.out.println("잔액 부족! 현재 잔액은 " + money +"입니다.");
						continue;
					}else {
						money -= output;
						System.out.println("출금 완료! 현재 잔액: " + money);
						break;
					}
				case 3 :
					System.out.println("현재잔액은" + money + "원입니다.");
					break;
					case 4:
						System.out.println("프로그램을 종료합니다 이용해주셔서 감사합니다");
					break;
					default:
						System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요");
	///else
	//{money -= output;
	//System.out.println("출금 완료! 현재 잔액: 5000원");
	//break;
	
	//case 3: System.out.print("프로그램을 종료합니다. 이용해주셔서 감사합니다!");
	//int output = sc.nextInt();
	
	}
	}
	}
}



	

