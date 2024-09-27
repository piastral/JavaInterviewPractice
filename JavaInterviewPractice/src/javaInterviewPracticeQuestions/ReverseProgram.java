package javaInterviewPracticeQuestions;

import java.util.Scanner;

public class ReverseProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number ");
		int num = sc.nextInt();

		int rem;
		int sum = 0;

		while (num != 0) {
		
			rem = num % 10; //take number 123 123 % 10 ==3 qutient = 12 
			sum = sum * 10 + rem; 
			num = num / 10;// 0* 10 +2 = 0 + 3 = 3 // 3 *10 + 2 = 30 +2 = 32 //32 *10 +1 321 //
			 //12 /10
		}

		System.out.println("the reverse number is :" + sum);
	}

}
