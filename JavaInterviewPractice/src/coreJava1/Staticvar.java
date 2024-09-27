package coreJava1;

public class Staticvar {

	public static void main(String[] args) {
		
		/*
		 * there is two type of variables in global variables 1 - static variables 2 -instance variables

		/* we will read now static variable : 1)which we are creating inside the class and those variables 
		 * are loading while class is loading : can be assesses directly within same class,2) Classname.
		 * variable name in different class,3)Classname.variable name in different package but make sure that variable
		 * should be public and import statement required declare static variable with static keyword
		 * 
		 */
		System.out.println(GlobalVariable.i); // classname.variablename in different class but same package
	}

}
