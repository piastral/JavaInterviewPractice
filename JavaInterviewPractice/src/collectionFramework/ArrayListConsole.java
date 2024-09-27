package collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListConsole {
	
	public static void main(String[] args) {
		// ArrayList<String>name= new ArrayList<String>();
	
		ArrayList l = new ArrayList();
		Scanner sc = new Scanner(System.in);
		// ill ask user to input data
		System.out.println("Enter the value ::");

		String j;
// use this to iterate the value inside the arraylist.
		for (int i = 0; i < 3; i++) { //user will add the value 
			j = sc.nextLine();
			l.add(j);
		
			
		}
		System.out.println("mahamri2"+l);
		
	
	System.out.println("Checking the input  added correctly by user or  not");
	for(int i= 0;i<l.size();i++) {
		
	}
	System.out.println(l);
	
	


}

}
