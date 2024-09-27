package oopsConcept;

interface software1{
	public void startDate();
	public void endDate();
	public void fee();
}

interface software2 extends software1{
	public void match();
	public void sports();
}




public class MultipleInheritanceByInterface implements software1 ,software2 { // multiple inheirtance

	public static void main(String[] args) {
		software1 s1 = new MultipleInheritanceByInterface();
		s1.startDate();s1.endDate();s1.fee();
        
		software2 s2 = new MultipleInheritanceByInterface();
		s2.startDate();s2.endDate();s2.fee();s2.match();s2.sports();
	}

	@Override
	public void match() {
		System.out.println("i will play foorball");
		
	}

	@Override
	public void sports() {
		System.out.println("i will play cricket ");
	}

	@Override
	public void startDate() {
		System.out.println("tommorrow 20 june");
		
	}

	@Override
	public void endDate() {
		System.out.println("25 dec");
		
	}

	@Override
	public void fee() {
		System.out.println("1500");
		
	}

}
