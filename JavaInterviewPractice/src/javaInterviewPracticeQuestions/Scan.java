package javaInterviewPracticeQuestions;

import java.util.*;

public class Scan {
// system.out is default package it belongs to java.lang package.whenever we are using any methods,class from java.lang
// java.langpackage import statement is not required
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// print first name and last name from user interview quest -no1 and add them
		// together

		System.out.println("please enter your first name ");
		String s = sc.nextLine();

		System.out.println("please enter your last name ");
		String s1 = sc.nextLine();

		System.out.println("So your name is :: " + s + " " + s1);
	}

}
