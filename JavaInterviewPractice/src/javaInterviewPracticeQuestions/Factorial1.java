package javaInterviewPracticeQuestions;
import java.util.*;
public class Factorial1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		System.out.println("Can you please enter the number ");
		int usr = sc.nextInt(); //usr will give one number for factorial puropise
		
		for(int i =usr ;i>0;i--) { 
			fact = fact*i;
		}
		System.out.println("factorial of "+usr+ " is :: " + fact);
	}

}
