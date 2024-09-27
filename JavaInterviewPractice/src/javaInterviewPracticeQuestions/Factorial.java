package javaInterviewPracticeQuestions;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		//we have to find factorial of a number take from user
		//factorial is nothing but 5! = 5*4*3*2*1
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your number");
		
		
		int num = sc.nextInt(); // input given by user 
		int fact = 1; // assigned 
		
		for(int i = 1;i<=num ;i++) { //increment till the number 
			fact= fact*i;
			
	}
		System.out.println("factorial of " +  num + "is "+fact);

}

}