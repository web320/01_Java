package edu.kh.op.practice;

import java.util.Scanner;

public class Practice2 {

	public void practice2() {
	
		
		scanner sc = new scanner();
		
		System.out.print("당신의 나이는 ? :");
        int age =  sc.nextInt();
        
        String personType = (age >= 20) ? "성인" : "미성년";
        System.out.println("저는 " + personType + "입니다");
        
        boolean isSensiorOrChild = (age >= 65)
		
	}

}
