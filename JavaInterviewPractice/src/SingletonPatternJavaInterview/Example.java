package SingletonPatternJavaInterview;

public class Example {

	public static void main(String[] args) {
		//here i can call the constructor so to achieve singleton we need to stop the constructor 
		//lets make the constructor private
	 Samosa samosa1 =  Samosa.getSamosa();
	 System.out.println(samosa1.hashCode());
	 
	 Samosa samosa2 =  Samosa.getSamosa();
	 System.out.println(samosa2.hashCode());
	 
	 

	}

}
