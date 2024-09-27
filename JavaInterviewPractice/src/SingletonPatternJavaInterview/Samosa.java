package SingletonPatternJavaInterview;
/*Singleton design pattern ::- lets say for an example in our project we want to create and object
 * and only one object and no more and reu-use that object all the time we call that singleton 
 * design :: one time object create and just reuse it n number of times 
 * for an example lets use dbms we do so many operation like crud ...all the time insert,delete..
 * lets say we have application and database so we dont need to have the connection multiple times
 * to perform crud operation in that case we will create one object and we will re-use that object
 * multiple times so with the help singleton object we will create one connection between app
 * and datbase and we will use that connection multiple times to perform crud operation
 * 
 * 
 * 
 * 
 */

public class Samosa {
  // constructor is called when we create object all the time it happens so to achieve singleton
	//we need to stop the constrcutor creation
	// stop the constructor by using the private so that no one can call constructpr
	//crrate A field that will return the vallue of the object
	
	private static Samosa samosa;
	
	private Samosa() {
		
	}
	// lazy of creating singleton
	public static Samosa getSamosa() {
		//object of tthis class only one time
		if(samosa==null) {
			samosa=new Samosa();
		}
		return samosa;
	}
	/*1 - constructor private 2-object create with the help of method
	 * 
	 */
}
