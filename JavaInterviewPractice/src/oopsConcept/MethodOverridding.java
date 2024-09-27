package oopsConcept;
// polymorphysim --overriding method concept
//write a program to show method overriding and develop a code which gives every month the interest rate for fixed deposit
class Jan {
	public void roi(String month) {
		System.out.println("Interest rate is : 7.5%");
	}
}

class Feb extends Jan {
	public void roi(String month) {
		System.out.println("Interest rate is : 8.0%");
	}
}

class Mar extends Feb {
	public void roi(String month) {
		System.out.println("Interest rate is 9%");
	}
}

class Apr extends Mar {
	public void roi(String month) {
		System.out.println("Interest rate is 10%");
	}
}


public class MethodOverridding {

	public void roi(String month) {
		System.out.println("May month interet rate is 11%");
	}

	public static void main(String[] args) {
		MethodOverridding cm = new MethodOverridding();
		cm.roi("may");

		Apr a = new Apr();
		a.roi("apr"); // apr is inheriting mar properties // but since we are using method overriding
						// the sub class which is april will be overriding superclass mar

		Mar m = new Mar();
		m.roi("mar"); // interest rate is for march {without inheritance we cannot achieve method overriding}
	}
//interview question can we override static method?
	// ans :- no we cannot because method override is based on runtime polymorphism whereas static 
	//methods are bonded at compile time 
	// since its binded with compile time we can actualy use static method on method overloading 
	//since method over loading is part of copile time polymophism 
	
}
