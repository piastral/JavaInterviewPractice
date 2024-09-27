package javaInterviewPracticeQuestions;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PLEASE ENTER A NUMBER");
		int num = sc.nextInt();
		int total = num;
		int rem ;
		int sum =0;
		while(num!=0) {
			rem = num%10;// 123 = 3 will be remainder
			sum =sum+rem;
			num =num/10;
		}
		System.out.println("the sum of digit of "+total+ " is: "+ sum );
				

	}

}
