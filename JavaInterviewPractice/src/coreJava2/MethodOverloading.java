package coreJava2;

public class MethodOverloading {
// creating method overloading
	public static void add(int a ,int b ) {
		System.out.println(a+b);
	}
	 public static void add(int a, int b , int c) {
		 System.out.println(a+b+c);
	 }
	
	public static void main(String[] args) {	
	/*//method over loading : sometimes we are creating same method name wit different
	 * arguments .when we are calling methods,we can differentiate method based on the arguments
	 * 	 
	 */  //METHOD OVERLOADING*
		add(50,30);  // same name of method different arguments 
		add(20,30,40); // same name different arguments

	}

}
