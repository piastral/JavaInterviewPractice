package oopsConcept;

class SuperType {

	public static void classMethod() {
		System.out.println("Super type class method");
	}

	public void instancemethod() {
		System.out.println("Super Type instance method");
	}
}

public class SubType extends SuperType {

	public static void classMethod() {
		System.out.println("Sub type class method is overriding super class method ");
	}

	public void instancemethod() {
		System.out.println("Sub Type instance method is overriding super class method");
	}

	public static void main(String[] args) {
		// lets create an object 
		SubType st = new SubType();
	
		st.instancemethod();
		// we can achive or static method with the help of classname .methodname
		SubType.classMethod();
		

	}

}
/*
 * Static methods cannot be overridden because they are not dispatched on the
 * object instance at runtime. The compiler decides which method gets called.
 * 
 * This is why you get a compiler warning when you write
 * static name means common name :: it should be common logic in all method 
 * static means common for all objects in hierarchy 
 * esxtend means updating 
 * the main functionality of static is missing in method overriding since we are updating child class logic
 *so the main feature of static is fading away which is commonality for all  
 *with static method you cannot uopdate logic in sub class
 *but instance method you can update by creating object
 * 
 */