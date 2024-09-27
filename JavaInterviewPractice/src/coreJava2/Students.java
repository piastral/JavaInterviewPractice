package coreJava2;

public class Students {
	int a;
	int b;

	// constructors with argments
	public Students(int m1, int m2) {
		a = m1;
		b = m2; // with the mhelp of constructor we can pass the value into methods thru objects
				// we dont need to give arguments in method
	}

	public void total() {
		System.out.println(a + b);
	}

	public void percentage() {
		System.out.println("the percentage of marks is " + (a + b) / 2 + "%");
	}

	public static void main(String[] args) {
		Students s1 = new Students(20, 30);
		s1.total();
		s1.percentage();

		/*
		 * let say we have 20 methods in class for an example and we have same data we
		 * dont need argument that time we can easily create an object an give the value
		 * to the constructor and it will work like wonders
		 * 
		 * constructors are very important if we are using non static variables and non
		 * static methods
		 */

	}

}
