package javaInterviewPracticeQuestions;

import java.util.Scanner;

public class ReverseLogicUsingForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please input a number ");
		int num = sc.nextInt();
		
		int rem; int qutient=0;
		
		for(;num!=0 ;num/=10) {
			
			rem = num%10; //123%10 = 3 
			qutient = qutient *10 +rem; // 0 * 10 + 3 = 3 
			
		}
		System.out.println("the reverse number is " +qutient);
	}

}
