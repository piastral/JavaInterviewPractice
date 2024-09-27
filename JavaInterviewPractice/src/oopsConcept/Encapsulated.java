package oopsConcept;

public class Encapsulated {

	private String name ;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age ) {
		if(age<18 || age >60) {
			throw new RuntimeException("Age should be in between 18 to 60 years");
		}
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() < 4 || name.length()>12) {
			throw new RuntimeException("Name should accept 4 to 12 characters");
		}
	}
	public static void main(String[] args) {
		
		
	}

}
