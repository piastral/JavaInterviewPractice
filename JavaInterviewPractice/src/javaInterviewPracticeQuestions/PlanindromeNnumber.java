package javaInterviewPracticeQuestions;

import java.util.Scanner;

public class PlanindromeNnumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//find palindrome number
		int sum = 0;
		int total = num;
		while(num!=0) {
			int rem = num%10;
			sum = sum *10+rem;
			num=num/10;
		}
		if (sum==total) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not palindrome");
		}
				
	}

}
