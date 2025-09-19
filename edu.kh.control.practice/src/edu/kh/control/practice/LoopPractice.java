package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	

	public void practice1() {
		System.out.println("1이상의 숫자를 입력해주세요");
		int input = sc.nextInt();
		
		if(input >=1) {
			for(int i=1; i<= input; i++) {
				System.out.print(i+ " ");
			}
		}else {
			System.out.println("1이상의 숫자만 입력해주세요");
		}
	
	}
	
	public void practice2() {
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			for(int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}else {
				System.out.println("1 이상의 숫자를 입력하세요 : ");
			}
		}
	}
	
	
	
	
		
	
