package coreJava2;

public class ConstructorOverloading {
	// constructor overloading
	int a;
	int b;
	int c; // non static variables .glba variables



	public ConstructorOverloading(int m1, int m2, int m3) {
		a = m1;
		b = m2;
		c = m3;  // whatever the values ill provide in constructor while creating objects it will be pass into instance variable 
		// those variables i can access within local method body
	}
  
	public void total() {
		System.out.println("the total marks is : " + (a + b));
	} // that means i can access global variable inside normal method imp points ..

	public void percentage() {
		System.out.println("the percentage of marks is " + (a + b) / 2 + "%");
	}

	public void total1() {
		System.out.println("the total marks is : " + (a + b + c));
	}

	public void percentage1() {
		System.out.println("the percentage of marks is " + (a + b + c) / 3 + "%");
	}

	/*
	 * sometimes we are creating multiple constructors with different arguments
	 * .while calling constructors we need to select constructor according to the
	 * data which we are passing
	 * 
	 */

	public static void main(String[] args) {
		
		ConstructorOverloading cv1 = new ConstructorOverloading(30, 40, 50);
		ConstructorOverloading cv2 = new ConstructorOverloading(50, 90, 100);

		cv2.total();
		cv2.percentage();
		cv1.total1();
		cv1.percentage1();
		
		/*advantages of using constructor arguments and not method arguments becaue lets say we have 10 methods and we have 
		 * to find total marks and percentage for each class and each class has 3 students and we have to find percentage 
		 * of three students and marks of only two students  ..
		 * so lets say we are have 10 differenet class and all the time i am just accessing the method without passing 
		 * arguments ,since constructor os there and global variable is there we can easily by creating the object of each
		 * class and passing the dat and on return we just write a logic in method body so that when we want to access it 
		 * comppiler will identify my values in constructor and call the method according with that 
		 * 
		 * 
		 */
	}

}
