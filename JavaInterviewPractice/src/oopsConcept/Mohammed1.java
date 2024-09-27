package oopsConcept;

public final    class Mohammed1 implements Moha {
	

	@Override
	public void show() {
		System.out.println("hey this is from another interface named moha remeber me ");
		
	}

	@Override
	public void m1() {
	System.out.println("this is from another interface named moha remebr me ");
		
	}
	public static void main(String[] args) {
		Moha m3 = new Mohammed1();
		m3.show();m3.m1();
	}

}
