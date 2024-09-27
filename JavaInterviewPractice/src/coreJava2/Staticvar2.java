package coreJava2;

import coreJava1.GlobalVariable;

public class Staticvar2 {

	public static void main(String[] args) {
		//there is two type of variables in global variables 1 - static variables 2 -instance variables

		/* we will read now static variable : 1)which we are creating inside the class and those variables 
		 * are loading while class is loading : can be assesses directly within same class,2) Classname.
		 * variable name in different class,3)Classname.variable name in different package but make sure that variable
		 * should be public and import statement required declare static variable with static keyword
		 * 
*/
		// what is static keyword::- static keyword can be used with class level variable and can
		// be acessed directly within class,can also be acessed with different class by claiing classname.variable namee
		System.out.println(GlobalVariable.i); // make sure the original variable should be public
	}

}
