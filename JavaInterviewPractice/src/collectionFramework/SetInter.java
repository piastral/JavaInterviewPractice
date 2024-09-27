package collectionFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetInter {

	public static void main(String[] args) {
		/*
		 * set interface in java is present in java.util package .it extends the
		 * collection inerface .it represent the undorderd set of elements which doesnt
		 * allow us to store the duplicate items. we can store at most one null value in
		 * set set is implemented by hashset, linkedhashset ,and treetset class
		 * Set<data-type > s1 = new HashSet<Datae-type>(); bullet points :: hashset
		 * stores the elements by using mechanism using hashing it contains only unique
		 * elemets allows nulll value hashset class is non synchornized doesnt maintain
		 * insertion order here elemets are inserted on the basis of there hashcode
		 * 
		 */

		Set<String> s1 = new HashSet<String>();
		s1.add("one");
		s1.add("two");
		s1.add("three");
		s1.add("four");
		s1.add("five");
		s1.add("one");
		System.out.println(s1);
		
		

	}

}
