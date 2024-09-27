package collectionFramework;

import java.util.*;

public class TraverseMethodCollectionPractice2 {

	public static void main(String[] args) {
		// to traverse arraylist we have 3 traversel
		// 1-ITerable(parent)for each 2- Iterator 3-ListItERATOR
		System.out.println("________FOR EACH LOOP STARTS________");
		ArrayList<String> names = new ArrayList<String>();
		names.add("masud");
		names.add("papa");
		names.add("rubel");
		names.add("ammi");
		names.add("bottle");
		// for each loop
		for (String data : names) {
			System.out.print(data + "\t" + data.length() + "\t");
			// we will reverse
			StringBuffer br = new StringBuffer(data);
			System.out.println(br.reverse());

			System.out.println("_________FOR EAch loop ENDS_________________");

		}

		// now we will traverse with the help of ITERATOR
		// iterator object is there on collection
		// forward traversing ;; in collection we will call the iterator and we will
		// take out the object
		//
		System.out.println("________ITERATOR START________");
		Iterator<String> itr = names.iterator();
		// this will give object iterator and lets store in one variable

		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
		System.out.println("________ITERATOR END________");
		// backword reverserl use list iterator
		// backword compatible use variable .size inside listiterator that it will
		// traverse backword
		// because by default the cursor is always moving forward
		System.out.println("***********LIST ITERATOR START***********");

		ListIterator<String> it = names.listIterator(names.size());
		while (it.hasPrevious()) {
			String nxt = it.previous();
			System.out.println(nxt);

		}
		System.out.println("***********LIST ITERATOR END***********");
		
		// enumeration for vector
		// Vectorclass
		// extends AbstractList
		// implements List<E>, RandomAccess, Cloneable, java.io.Serializable
		// only possible for vector ennumeration
		System.out.println("________VECTOR ENUM STARTS________");
		Vector<String> vector = new Vector<String>();

		vector.add("Chaitanya");
		vector.add("Shubham");
		vector.add("Apoorv");
		vector.add("Jin");
		vector.add("Jacob");
		// get enumeration of vector elements
		Enumeration en = vector.elements();

		// this will give me boolean result
		
		while (en.hasMoreElements())
			
		System.out.println(en.nextElement());
		System.out.println("+++++++++++VECTOR ENNUMERATION ENDS++++++++++++++++++");
		
		//for each method
		//names.forEach(null);
	//	Consumer interface is functional interface
		// to use for each method we have to use lambda epression 
		System.out.println("**********FOR EACH METHOD STARTS************");
		names.forEach(e->{
			System.out.println(e);
		});
		System.out.println("+++++++++++FOR EACH METHOD ENDS++++++++++++++++++");
		

	}
}
