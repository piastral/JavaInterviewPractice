package coreJava2;

public class StaticMethod {
	int mo = 10;
	int ru = 20;

	int adi() {
		System.out.println("hello");

		int result = mo + ru;
		return result;

		// lets create instance
		
	}
	
	
	


	

	public static void main(String[] args) {
		// static method which we are creating inside the class and static methods are
		// loading while cl
		// class is loading we can acess these methods directly within the class
		// classname.method
		// name in different class / classname.methodname // different package
		// classname.methodname
		// static method belongs to class it never belongs to object or instance
		// also main feature of static method is global for all that means common for
		// all lets
		// for an example:: lets say we are writing two methods and using static keyword
		// the logic inside
		// tow method should be same should be common
		// we cannot write static variable inside static method because static belongs
		// to the class
		// inside method we should have only local variables
		// lets test can we use static variable inside static method
		// final int ab =10; //i can use final but not static

		StaticMethod sm = new StaticMethod();
		int mm = sm.adi();
		System.out.println(mm);
		
	String s1 = "muhammed";
	System.out.println(s1.replace("u","o" ));

	}

}
