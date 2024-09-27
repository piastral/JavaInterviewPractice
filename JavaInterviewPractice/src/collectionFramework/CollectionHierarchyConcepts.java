package collectionFramework;

public class CollectionHierarchyConcepts {
	
/* COLLECTION FRAMEWORK
 * what is collection?= any group of individual objects whjich are represented as a single unit is knowsn as
 * the collection of the objects eg  collection of books kept in one place 
 * what i framework??= framewrok is as et of classes and interfacec which provide a ready made architecture
 * framework : has library of classes and interface 
 * 
 * collection framework :: is java api which provide architecure to store and manipulates group of objects
 * in this api we have set of classes and interface ...
 * where i will get the library of collection...in java.util
 * 
 * lets say we are having libraries of collection ,map set list queue etc..so we will use this libraries to and 
 * manipulates the group of objects and we will perform some operation 
 * so lets say whatever the classes are there in cleection internally they are based some kind of data structure
 * so we dont need to write the algo to get effieceny we can use this classes and interface to achieve this 
 * for example :: list :: working on arraylist whhich is dynamically data is being stored 
 * same with tree 
 * collection hieararchy came in 1.2 version vut vector was legacy class it was wasy before collection came int
 * picture i was on version 1.0 and java is also backward compatible so when new thing came in java we didnot
 * remove the old stuff 
 * arraylist is non thread safe 
 * vector is thread safe 
 * vvimp question interview 
 * HOW TO TRAVERSE in CLASSES WHAT TRAVERSERAL WE WILL USE TO FETCH THE ELEMENTS??
 * ANS:: 
 *
 *  1st step :: for -each 
 * in collection framework basically :: collection get implement by one interface which is ITERABLE which is also
 * a interface ,so we can clal iterable as parent interface so whoever will implement collection will also get
 * iterable  so we will use FOR-EACH to traverse 
 * 
 * 
 * 
 * 
 * 2nd step: using ITERATOR the object of iterator is kept in collection and maintains
 * has-a relations  this only provides forward direction loop we cannot use backward direction 
 * 
 * 
 * 3RD STEP ::-LIST ITERATOR IS(forward  & backward ) compatible  ONLY for list interface and its classes
 * to achieve backward direction also we use one interface call LIST ITERATOR (BACKWARD COMPATIBLE) EXTEND from
 * ITERATOR SO LIST ITERATOR IS(forward  & backward ) compatible 
 * and only LIST EXTEND THE LIST ITERATOR ..LIST ITEARTIR is also interface 
 * that means IF LIST HAS LIST ITERATOR (BACKWARD AND FRONT ) that means all classes that implements list will
 * also have that feature
 * 
 * 4th  step -vector and stack gets ENUMERATION becuase itvector came before collection 
 * 
 * and also we have another way to traverse in vector since it came in first version so there is some way 
 * it is called enumeration stack also get enumeration 
 * 
 * 5th step::: java  1.8 version came out it came with FOR-EACH()METHOD. we can traverse 
 * 
 * 
 * 
 * 
 * 
 * 
 * 	
 */
	
	

	
}
