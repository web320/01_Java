package edu.kh.variable;

import java.util.Scanner;


public class ScannerExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//사칙연산 계산기
		// -> 두실수를 입력받아 사칙연산 결과를 모두 출력
		// -> 단, 출력된 결과값은 소수점 이하 둘쨰자리까지만 표현
		
		//정수 : sc.nextInt()
		//실수 : sc. nextdoble();
		
		System.out.print("첫번째 실수 입력");
		double input1 = sc.nextDouble();
		
		System.out.print("두번째 실수 입력");
		double input2 = sc.nextDouble();
	
	// + - *
		System.out.printf("%.2f - %.2f =%.2f\n", 
				input1, input2, input1 - input2);
		
	
		System.out.printf("%.2f +%.2f =%.2f\n", 
				input1, input2, input1 + input2);
		
		System.out.printf("%.2f * %.2f =%.2f\n", 
				input1, input2, input1 * input2);
		
		System.out.printf("%.2f /%.2f =%.2f\n", 
				input1, input2, input1 / input2);
		

		
		
	}

}