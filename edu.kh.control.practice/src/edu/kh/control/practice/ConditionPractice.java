package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	// ctrl + shift + f : 코드 자동 정렬
	public void practice1(){
	System.out.print("숫자 한 개 입력하세요");
	int input = sc.nextInt();
	
	if(input<= 0) {
		System.out.println("양수만 입력해주세요");
	
	}else if(input % 2 == 0) { 
		System.out.println("짝수입니다");
	}else if (input % 2 ==1 ) 
		{System.out.println("홀수입니다");
		
	}
}
	public void practice2() {
	
		System.out.print("국어점수 : ");
		int kor = sc. nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		
		if (kor>=40 && math>=40 && eng>=40 && avg >=60) {
			
			System.out.printf("국어 : %d\n 수학 : %d\n 영어 : %d\n 합계 :%d\n 평균 : %.1f\n 축하합니다, 합격입니다!",
					kor, math, eng, sum, avg);
			
		}else {
				System.out.println("불합격입니다");
			}
		}
	public void practice3() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
	
		switch(month) {
		case 1,3,5,7,8,10,12:
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		
		case 4,6,9,11 :
			System.out.println(month + "월은 30일까지 있습니다");
		break;
		
		case 2 : System.out.println(month + "월은 28일까지 있습니다");
		break;
		
		default : System.out.println(month + "월은 잘못 입력된 값입니다.");
			
		}
	
	
	}
	//alt 방향키
	public void practice4() {
	
		System.out.println("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해주세요 : ");
		double weight =sc.nextDouble();
	
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 :" + bmi);
		
		String result;
		
		if(bmi <18.5) {
			result = "저체중";
			
			
		}else if(bmi <23) {
			result = "정상체중";
			
		}else if(bmi < 25) result = "과체중";
		}
	
	public void practice5() {System.out.print("중간고사 점수 : ");
	Double midTurm = sc.nextDouble();
	
	System.out.println("Fail [출석 횟수 부족] ("+ 
	(int)+ attendance + '/20"));
	if(attendance <= 20* 0.7) { //출석횟수 부족으로 인한 낙제
		
	}else {// 출석 만족 시}
	}
	System.out.printf("중간 고사 점수(20 : %.1f\n", midTerm);
	System.out.printf("기말 고사 점수(20 : %.1f\n", midTerm);
	System.out.printf("과제 점수(20 : %.1f\n", midTerm);
	System.out.printf("출석 점수(20 : %.1f\n", midTerm);
	
	double sum = midTerm + finalTerm + report + attendance;
	
	
	
}		
}


	
	

