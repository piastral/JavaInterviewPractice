package coreJava2;

public class InstanceMethods {

	public static void main(String[] args) {
		/*
		 * non static methods are creating inside the class ,and they are loading while
		 * object is creating thats why non static/instance can only bec acess by
		 * creating object
		 * 
		 */

		Methods obj1 = new Methods();

		obj1.n1();
	}

}
