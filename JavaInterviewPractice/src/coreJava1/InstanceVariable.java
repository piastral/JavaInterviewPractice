package coreJava1;

public class InstanceVariable {

	
	int i = 10;
	int c = 20;
	
	public static void main(String[] args) {
		//instance variable/nonstaticvariable
		/*non static variables are creating inside the class and these variables are loading 
		 * while object creating we can access non static variables with the help of object 
		 * 
		 */
		
		InstanceVariable obj = new InstanceVariable() ;
			// 100 percent object is necessary to call instance variable 
		
  System.out.println(obj.i); // calling instance variable by reference name with the help of object
		
	}

}
