package coreJava2;

public class MethodsParameter {
	
	// creating the method with argument or parameter
	public static void add(int a ,int b) {
		System.out.println(a+b);
	}
	
	public void mul(int a , int b) {
		
		
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		
/* sometimes we need to execute the same methods multiple times with different data . in that case
 * we are creating methods with arguments so that while accessing the methods we can pass the data 
 * into methods through arguments
 * 
 * note:- methods we can create with arguments are either static or non static methods only the way 
 * we are calling is different from static to non static 
* 
*/
		add(50,20);  // we are giving arguments in static method but without any values
		// we are giving values when we are calling that method
	  
		MethodsParameter obj = new MethodsParameter();
		obj.mul(20, 10);
	   
	}
	
	/*method declarATION:: PROVIDES information about method attributes,such as visivbility 
	 * ,return type, name and aruguments  it has six componenets that are known as method header
	 *   
	 *   public = modifier/specifier
	 *   int = return type
	 *   max = method name 
	 *   max(int x int y ) -parameter list 
	 *   so if we combine this 
	 *   public int max(int x, int y){
	 *   -----
	 *   -----  method body where logic wil play
	 *   }
	 *   
	 */

}
