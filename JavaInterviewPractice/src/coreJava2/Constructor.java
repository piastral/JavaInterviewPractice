package coreJava2;

public class Constructor {
	// constructor without arguments
	public Constructor() {
		System.out.println("this is constructor"); // no return type
	}
	// creating method
	public void m1() {
		System.out.println("this is method"); // return type void 
	}
	//constructor with arguments : which has parameter while creating constructor we need to pass arg into objects
	public Constructor(int m1 ) {
		a = m1;
		
	}
	int a ;// non static variable

	public static void main(String[] args) {
/* constructors are similar to methods which is loading while creating objects with the help of constructor 
 * we can pass the data into the methods through objects.
 * in java, a constructor is block of codes similar to the method .it is called when an instance 
 * of the class is created
 * it is special type of method which is used to initiliaze the object 
 * everytime an onject is created using the new keyword at least one constructor is called
 * rules of constructors:
 * 1-constructors name should be ssame as class name 
 * 2-constructors should not have any return type 
 * one class can contain n number of constructors all the constructor name must be same as class name but with different argumnts we can called constructoir 
 * overloading 
 * 
 * 		
 */
		Constructor obj1 = new Constructor();
	obj1.m1();

	
	}

}
