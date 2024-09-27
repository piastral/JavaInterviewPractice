package collectionFramework;
//lets import the libraries of classes
import java.util.*;

public class InterviewPracticeCollection1 {
	
	//so lets use list interface and from there we will get arraylist follow the hierarchy
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*creating collection 
		 * 1-type safe - same type of elements are added to collection generic
		 * 2)- un type safe non generic 
		 * 
		 */
		//TYPE SAFE COLLECTON using diamond operatior generic 
		
		
		//un -type safe non generic 
		/*
		 * LinkedList lis = new LinkedList(); lis.add("hajar"); lis.add(121);
		 * lis.add(true);
		 * 
		 * 
		 * lis.add("mohammed");
		 */
		ArrayList<String> names = new ArrayList<String>();
		names.add("masud");
		names.add("papa");
		names.add("rubel");
		names.add("ammi");
		names.add("bottle");
		String	s =names.set(4,"pen");
		System.out.println("i am setting the name in different index using the Index and KEYWORD " + names);
		System.out.println(names);
		names.forEach(System.out::println);
		names.remove(4); //we can pass 4 method with remove object
		names.removeFirst();
		names.remove("bottle");
		System.out.println(names);
		
		// size of the element
		System.out.println("SiZE IS "+names.size());
		//validate the object is there in collection or not 
		System.out.println(names.contains("Durgesh kumar"));
		//check for empty collection  
		System.out.println(names.isEmpty());
	   //this method came in java 1.8 version
	   // remover all elements with cleAR METHOD
		//names.clear();
	//	System.out.println(names);
		
		//use vector now 
		Vector<String> vec = new Vector<>();
	    vec.addAll(names);
	    System.out.println("vector is " +names);
	    
			System.out.println("_____________________________________________");
			
			/*hashset is double type safe we can only use double  in hashset primitive type doesnt work 
			 * only wrapper class work
			 * basically there is one rule on java whenever we pass the value it becomes auto box that means
			 * automatically it will convert into wrapper class whenever we will write in primitive 
			 * it will uboxed
			 */
			HashSet<Double> nms = new HashSet<>();
			nms.add(14.14);
			nms.add(99.3);
			nms.add(1.1);
			nms.add(2.1);
			nms.add(3.1);
			
			System.out.println(nms);
			//list has extra methods but set doesnt have
			System.out.println("___________________________________________");
			
			
			TreeSet<Double> tset = new TreeSet<>(); //  we will get sorted elements when we will traverse
			tset.addAll(nms);
			System.out.println(tset);
		
	}
	

	 
}
