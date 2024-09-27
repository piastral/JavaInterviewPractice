package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

/*JAVA NON -GENERIC VS GENERIC COLLECTION:
 * java collection framework was non generic before jdk1.5 since 1.5 it is generic java new generic collection allows
 * you to have only one type of object in a collection now it is typesafe ,so typecasting is not required 
 * for example :::---Arraylist  variable= new Arraylist();// creating non generic arraylist
 * 
 * Arraylist<String> list = new ArrayList<String>();// create generic string 
 * with angular braces<> we are forcing java to have only specified type of objects in it if you try to add another
 * data type or objects it gives compile time error
 * 
 * 
 * 
 */
public class ArrayList1 {

	public static void main(String[] args) {
		// array list can dynamically sort array there is no size limit .it maintains
		// insertion order,it supports
		// duplicate elements
		// more flex than traditional array
		// we can implement the array list with the help of list interface

		ArrayList l = new ArrayList();
		l.add(123);
		l.add("mohammed");
		l.add("mohammed");
		for(int i = 0;i<l.size();i++) {
			System.out.println(l);
		}

		// generic array list

		ArrayList<String> name = new ArrayList<String>();
		name.add("mohammed");
		name.add("fazal");
		name.add("baba");
		for (String data : name) {
			System.out.println(data);
		}
		/*GET AND sET aRRAYlIST 
		 * THE GET()METHOD returns the element at the specified index ,wheras the set() method changes the element
		 * 	
		 */
			
//how for each loop works :basicallly it uses any variables on its wown with the data type and whatever value is ther for
			//different variable it copies the values to its own variable and than print 
			
			//get and set method
		System.out.println("checking with get method and accessing with the help of index");
			name.add("mohammed");
			name.add("fazal");
			name.add("baba");
			
			System.out.println(name.get(2));
			//modify the elemnts with the set method
			System.out.println(name.set(1, "hajar"));
			System.out.println(name.get(1));
			System.out.println("addiding the value in index 1 ");
			name.add(1, "paglu");
			System.out.println(name);
			Collections.sort(name);
			System.out.println("after sorting");
			System.out.println(name);
			
			
			
		}

	}

