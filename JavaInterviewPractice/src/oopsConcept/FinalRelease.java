package oopsConcept;

//first release class 
abstract class FirstRelease { // it is class declared with abstract keyword
	public static void classRoom() { // ab class may or maynot have abstract method it can have concrete method
		System.out.println("Class Room Training is Started");
	}

	public  abstract void online(); // it will start now // abstract method 

	public abstract void corportate();//this is abstract method is as method that is declared without an implementation
}

abstract class SecondRelease extends FirstRelease {

	public  void online() {
		System.out.println("online training started "); //method defined abstract must always be redefined in the subclass
		// thus making overriding compulsory Or either make subclass itself abstract 

	}

}

public class FinalRelease extends SecondRelease {

// creating one startup for training centres we will develop application

	@Override
	public void corportate() {
		System.out.println("Corporate training is started");
	}

	public static void main(String[] args) {
		FinalRelease f = new FinalRelease();
		
		
		f.corportate();
		FirstRelease.classRoom();

	}
//INTERVIEW QUESTION?
/*CAN WE CREATE object of an abstract class?
 * ans :- no we cannot create object of an abstract class first of all we are using objects to access non static members
 * but in abstraction the members is there without an implementation that is without any body 
 * so there is no use case of calling 
 * and also we cannot create constructor of incomplete class
 * in java abstraction is achieved by using interfaces and abstract class
 * we can achieve 100% abstraction with interface 
 * we can create constructpr of an abstarct class
 */
	

}
