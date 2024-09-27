package oopsConcept;

class Father {
	public void gold() {
		System.out.println("i am giving gold to my childrens");
	}

}

class Child extends Father {
	public void shares1() {
		System.out.println(
				"i am taking gold from parents and i own shares of xyz company :: i am the first child hajar ");
	}

}

public class Children1 extends Father {

	public void crypto() {
		System.out.println("i am also taking gold from my father and i own crypto :: i am the second child :rubel ");
	}

	public static void main(String[] args) {
		Children1 c = new Children1();
		c.gold();
		c.crypto();

		Child c1 = new Child();
		c1.shares1();
		c1.gold();

	}

}
