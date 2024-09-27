package javaInterviewPracticeQuestions;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int rem ;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int num = sc.nextInt();
		int total = num;
		while(num!=0) {  //lets take number 153 
			rem = num%10; 
			sum = sum  + (rem*rem*rem); //27
			num = num/10;
			
		}
		if(sum==total) {
			System.out.println("it is armstrong number");
		}else {
			System.out.println("it is not armstrong");
		}

	}
 
}
