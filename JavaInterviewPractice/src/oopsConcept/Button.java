package oopsConcept;

public class Button {

	// creating variables
	int a;
	int b;
	String c;

	// creating Constructor
	public Button(int height, int width, String bname) {
		a = height;
		b = width;
		c = bname;
	}

	// creating methods

	public void buttonCreate() {
		System.out.println("Button is created with height ,width and Name as : " + a + " " + b + " " + c);
	}

	public void buttonClickable() {
		System.out.println(c + " button is clicakble");
	}
	public void ButtonDelete() {
		System.out.println(c + " button is deleted");
	}

	public static void main(String[] args) {
		Button b1 = new Button(20,50,"OK");
		b1.buttonCreate();
		b1.buttonClickable(); b1.ButtonDelete();
	}

}
