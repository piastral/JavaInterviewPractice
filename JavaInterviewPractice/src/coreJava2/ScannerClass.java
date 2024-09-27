package coreJava2;

import java.util.*;

public class ScannerClass {

	public static void main(String[] args) {
		/*
		 * scanner class is pre defined class is present in java.util package which we
		 * are using to scan the values from the console it is also used to take input
		 * from user.
		 * 
		 * with 	ctrl + shift +f we can control the format it will come in sratight
		 *
		 */

		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("enter a value of a ");
		int a = sc.nextInt();

		System.out.println("enter the value of b");
		int b = sc.nextInt();

		System.out.println("addidtion of a and b is "+ (a+b));
		*/
		
		System.out.println("hello ::m what is your First Name ?");
		String s = sc.nextLine();
		
		System.out.println("can you tell me also your Last Name ?");
		String s1 = sc.nextLine();
		
		System.out.println("So your Full Name is ::"+( (s) + " "+ s1));
	}

}
