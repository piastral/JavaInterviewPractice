package javaInterviewPracticeQuestions;

import java.util.Scanner;

public class SwappingNumbers {
	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("please put the value of A to swap  ");
		int a = sc.nextInt();
		System.out.println( "please put the value of B to swap" );//= 10;
		int b = sc .nextInt();                          //=20;
		a=b+a; // 20+10== 30 // a becomes 30;
		b=a-b; // 30-20 // b becomes 10
		a=a-b; // 30-10 == 20 a bcomes 20
		
		System.out.println("After swapping the value of A : is "+a);
		System.out.println("After swapping the value of B:  is  "+b);
		
		
	}
}
