package oopsConcept;

class GrandParents {

	public void gold() {
		System.out.println("granfather bought gold");
	}

}

class Parents extends GrandParents {
	public void land() {
		System.out.println("parents taking gold from its father");
	}
}

public class Children extends Parents {
	public void shares() {
		System.out.println("i am the child new generation i will  take gold and land from my parents and my parents already took gold from my granparents");
	}

	public static void main(String[] args) {
    
		Children c1 = new Children();
		c1.gold();c1.land();c1.shares();
		
		Parents p = new Parents();
		p.gold();p.land();//parents can only take gold from its parent 
	}

}
