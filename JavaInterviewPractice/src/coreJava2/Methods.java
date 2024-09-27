package coreJava2;

public class Methods {
	// creating static method
	public static void s1() {
		int a = 10; int b = 20;
	System.out.println(a+b);
	}
	
	// non static method
	public void n1() {
		int a = 40; int b = 60;
		System.out.println(a*b);
	}
	
	

	public static void main(String[] args) {
		/*a method is block of code or collection \of statmetns grouped together to perform certain 
		 * task .it is used to achive the reusabilty of code.
		 * (if any logic is reusable for multiple times we are identifying that logic  and make it as amethod or function 
		 * here whenever we need that logic instead of writing code once again and again we can simply
		 * call that method and perform the action 
		 * 
		 * PREDEFINED METHOD():we also have pre defined method we are re using it wheenver it is requred eg length()
		 * USER DEFINED METHOD() WHEN USER WILL WRITE THE METHODS..
		 * 
		 * 
		 * THERE ARE TWO TYPES OF METHODS IN JAVA 
		 * 1. STATIC METHODS
		 * 2.NON-STATIC METHODS
		 */
		
		//LETS CALL STATIC METHOD
	s1();
		Methods obj = new Methods();
		obj.n1();
		
		
		
	}

}
