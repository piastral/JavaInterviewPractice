package oopsConcept;

public class ChildSingleInheritance extends ParentSingleINhertiance {
	
	public void gold() {
		System.out.println("gold");
	}

	public static void main(String[] args) {
		 ChildSingleInheritance c1 = new ChildSingleInheritance();
		 c1.land();c1.gold(); // accessing parent property and also accessing my property

	}

}
