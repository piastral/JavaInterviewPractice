package javaInterviewPracticeQuestions;

import java.util.Scanner;

public class FactorialWhileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("please give one number");
		int num = sc.nextInt();
		
		int fact = 1;
		while (num != 0) {
			fact = fact * num;
			num--;

		}
		System.out.println("factorial is :" + fact );
	}

}
