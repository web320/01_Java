package edu.kh.control.practice;

import java.util.Scanner;

public class AtmSimulator {

	Scanner sc = new Scanner(System.in);

	public void ex1() {

		int money = 10000;
		System.out.println("=== ATM 프로그램 시작 ===");
		System.out.println("현재 잔액 : " + money + "원\n");
		int num = 0;

		while (num != 4) {
			System.out.println("메뉴를 선택하세요: ");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">> ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("\n입금할 금액을 입력하세요 : ");
				int input = sc.nextInt();
				money += input; // money = money + input
				System.out.println("입급 완료! 현재 잔액 : " + money + "원\n");
				break;
			case 2:
				System.out.print("\n출금할 금액을 입력하세요 : ");
				int output = sc.nextInt();
				if (money < output) {
					System.out.println("잔액 부족! 현재 잔액은 " + money + "원입니다.\n");
					continue;
				} else {
					money -= output; // money = money - output
					System.out.println("출금 완료! 현재 잔액 : " + money + "원");
					break;
				}
			case 3:
				System.out.println("\n현재 잔액은 " + money + "원입니다.\n");
				break;
			case 4:
				System.out.println("\n프로그램을 종료합니다. 이용해주셔서 감사합니다!");
				break;
			default:
				System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요.");

			}

		}

	}

	public void ex2() {
		System.out.println("=== 주사위 맞히기 게임 시작 ===");
		System.out.println("1~6 사이 숫자를 맞혀보세요. (종료를 원하면 \"종료\" 입력)");
		System.out.print("숫자 입력 >> ");
		String input = sc.next();
		int answer = (int)(Math.random() * 6 + 1);
		int count = 0;
		int win = 0;
		boolean result = input.matches("종료");
		while(result){
			
			System.out.println("=== 게임 종료 ===");
			System.out.printf("총 시도 횟수 : %d번\n",count);
			System.out.printf("정답 횟수 : %d번\n", win);
			if(count == 0) {
				System.out.println("게임을 플레이하지 않았습니다.");
			} else {
				System.out.printf("정답률: %d%\n",(win * 100) / count);
			}
			break;
		
		}
	}

	public void ks1() {
		// TODO Auto-generated method stub
		
	}

	
		
	}

