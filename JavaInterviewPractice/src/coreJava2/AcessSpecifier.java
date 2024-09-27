package coreJava2;

public class AcessSpecifier {
	
	public static int a = 10;
	protected static int b = 20;
	private static int c = 30;
	static int d = 40; // default acesss specier

	public static void main(String[] args) {
		
		//access specifier : 
		/* we are using ascess specifer to provide acess permisiion to variables ,methods and constructore
		 * in java there 4 different type 
		 * 1.public
		 * 2.private
		 * 3.Protected
		 * 4.Default
		 * 
		 * 1 -public acess :: public acesss specifer allows variables ,methods ,constructors, anywhere(other packages)
		 * 2 protected - aloows variables ,methods,constructors only within same package
		 * 3- private acess specifier allows variables ,methods ,constructors only within same class
		 * 4-Default=(no acess specifier) allows variables ,methods only within the same package 
		 */ 
		 System.out.println(a+b+c+d); // even it is public ,protected , private ,default we can acesss in same class
	

	}

}
