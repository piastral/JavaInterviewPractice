package coreJava2;

public class ReturnTypeInJava {
	
	public static int m1() {
		int a = 10; int b = 20;
		int c = a+b;
		return c;
	}
public static boolean m2() {
	String a = "Rubel";
	boolean result= a.startsWith("R");
	return result;
	
}
public String a3() {
	String a = "mama";
	String b = "gama";
	String res = a.concat(b);
	return res;
			
}
	public static void main(String[] args) {
/*every method in java is declared with retun type and it is mandatory for all java 
 * methods, a return type may be primitive type like int,float,double or void type
 * note : the type of dat returned by a method must be compatible with the return 
 * type specified by the method
 * 
 * 	
 */
		System.out.println(m1());
	//	System.out.println(m2());
		
		ReturnTypeInJava obj1 = new ReturnTypeInJava();
	System.out.println(obj1.a3());

  }
}
