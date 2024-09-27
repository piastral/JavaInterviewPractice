package oopsConcept;

 interface software {

	public void startDate(); // abstract method

	public void endDate();

	public void fee();
}

class School1 implements software {  // i can create object in the name of reference of interface and using constructor name
	
	// as class name 

	@Override
	public void startDate() {
		System.out.println("JAN 20");

	}

	@Override
	public void endDate() {
		System.out.println("Dec 20");

	}

	@Override
	public void fee() {
		System.out.println("$500");

	}
}
// school2 implements software 
class School2 implements software {

	@Override
	public void startDate() {
		System.out.println("hell i am awesome");

	}

	@Override
	public void endDate() {
		System.out.println("hello my name is mohammed");

	}

	@Override
	public void fee() {
		System.out.println("hello i am qa engineer");

	}
}



public class School3 implements software {

	@Override
	public void startDate() {
		System.out.println("mar 20");

	}

	@Override
	public void endDate() {
		System.out.println("oct 10");

	}

	@Override
	public void fee() {
		System.out.println("$1500");

	}

public static void main(String[] args) {
		
		software s1 = new School1();
		s1.startDate();s1.endDate();s1.fee();
		
	   software ss1 = new School3();
	   ss1.startDate();ss1.endDate();ss1.fee();		
		
	   School2 ss2 = new School2();
	   ss2.startDate();ss2.endDate();ss2.fee();
		

	}
/*Q= what is the difference between java interface and abstract class
 * ans : interface is like class with variable and methods but the method that interface support is without
 *  implementatiom
 * that is method signature without body we can achieve total abstraction in interface 
 * interface can be implemented with interface keyword
 * and class wants to implemets interface must also implements methods declared in interface 
 * and we can create object of interface 
 * 
 * abstract class is a incomplete class any abstract class we want to declare we should declare with abstract
 *  keyword
 * and abstract class may or maynot have abstract methods but it may have concrete method
 * 
 * if there is abstract method in abstract class it must be unimplemented on a sub class thus makind overriding 
 * compulsary or either we can make subclass abstract 
 * and we cannot create object of an abstract class because we want to access non static members ,since we in
 *  abstract class
 * non static methods will not have body so we cannot access
 * 
 * main points ::
 * abstract class is a collection of abstract method and non abstract methods that is  concrete method 
 * whereas interface is only collection of abstract method
 * abstract class we use extend keyword && class to interface we will use implements keyword
 * in interface we dont use abstract keyword because interface is implcitly abstract 
 * and in abstract class we use abstract keyword 
 * with the help of interface we get 100 percent abstraction 
 * with abstract class we cant have 100 percent abstraction
 * with abstract class multiple inheritance is not possible but with interface multiple inheritance is possible
 *  
 * 	why do we use interface?
 * it is used to achiev total abstraction
 * by interface we can support the functionality of multiple inheritance 
 */
	
}
