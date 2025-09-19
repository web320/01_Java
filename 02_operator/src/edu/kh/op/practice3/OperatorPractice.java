package edu.kh.op.practice3;

import java.util.Scanner;
// ctrl + shift + o : 자동 임포트
public class OperatorPractice {

	
	//기능 제공용 클래스
	public void practice1(){
		/*
모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

[실행화면]
인원 수 : 29
사탕 개수 : 100
1인당 사탕 개수 : 3
남는 사탕 개수 : 13
		 * 
		 * 
		 * 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("사탕개수 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n", input2 / input1);
		System.out.printf("남는 사탕 개수 : %d", input2 % input1);
		
		public void practice2();
		
		/*
		 * ex.
		이름 : 홍길동
		학년(정수만) : 3
		반(정수만) : 4
		번호(정수만) : 15
		성별(남학생/여학생) : 남학생
		성적(소수점 아래 둘째 자리까지) : 85.75
		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		 * 
		 * 
		 * */
		 
		  Scanner sc = new Scanner(System.in)
;		 
		System.out.print("이름 : ");
	   String name = sc.nextInt();
	   
	   sc.nextLine // 개행문자 제거용(입력버퍼에 남은 개행문자 비우기)
	   
	   System.out.print("성별(남학생/여학생 : " );
	   String gender = sc.nextLine();
	
	   System.out.print("성적 : ");
	   double score =sc.nextDouble();
	   
	   System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",
			   grade, classroom, number, name, gender, score);
	   
	   
	   
	   
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
	 
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("합계: " +sum);
		System.out.printf("평균 : %.1f", avg);
		
		//각 과목이 40점 이상이고,
		//평균 60점 이상이어야 합격
		// 그 외 불합격 출력
		
		boolean result = (kor >= 40) && (eng >= 40)
		&& (math >= 40) && (avg >= 60);
		
		System.out.println( result ? "합격" : "불합격");
							//조건식?true수행:false수행;
							//조건식을 result라고도 쓸 수 있다한다
	
	}
}
