package coreJava1;

public class StringPracticePart1 {
/*What is string ? 
 *1 Ans : sequence of character enclosed in double quotes in known as string 
 *2 2-Array of characters is known as strin 
 *--------------------------------------------------------------------
 * 3example :: char arr[]= new char[3]
 * 4  arr[0]='a' arr[1]='b' arr[2] ='c'
 * 5 String ss - new String(arr);
 * ----------------------------------------------------
 * 6  String is class in java (FINAL CLASS )
 *7  String class implements Serizable ,comparable,Charsequence interface 
 * 8 String class is immutable in java (immutable means non changeable)
 * 9 for string we have special memory areas(that is SCP ..STRING CONSTANT POOL )
 *10 We can create string in java 4 ways 
 * ------------------------------------------------------
 * 1-Using string literal  
 * eg String ss ="mohammed" ..this is called string literal
 * 
 *2 - Using new keyword
 * String s1 = new String ("mohammed");
 * ---------------------------------------------------------
 * 3-USING STRING BUFFER CLASS ---> StringBuffer sf = new StringBuffer("Mohammed")
 * ----------------------------------------------------------------------------------------------
 * 4-Using string Builder  ----> String Builder sf = new StringBuilder("Hajar")
 * 
 * ...Lets say we develop our program with
 *1 using string literal it gets stored in---->SCP 
 * 2 with the new keyword it gets stored in heap area and also SCP
 * 3-String buffer---> heap areas 
 * 4 String builder ---->heap areas 
 * we can not extend final class in java which is string class
 * 
 * 
 * 
 * 
 * 	
 */

	public static void main(String[] args) {
		String a = "abcdefxy";
		String b = "xyz1234";
		String c = "abcdefxy";
		
		// 1 quest - verify the length of  A variable should be greater than length of the c variable
		// and should be less than length of the B variable
				
          if((a.length()>c.length()) && (a.length()<b.length())) {
        	  System.out.println("pass");
          }else  {
        	  System.out.println("fail");
             
        		 
	}
          //2 ques a variable should not be same as B variable and C variable
          
          if(!a.equals(b) && (!a.equals(c))){
        	  System.out.println("pass");
          }else {
        	  System.out.println("fail");
          }
          // 3 C variable should be same of A variable irrespective of the case
          if(a.equalsIgnoreCase(c)) {
        	  System.out.println("A variable is equal");
          }else {
        	  System.out.println("A variable is not equal");
          }
          
          // 4) A variable should contain cd and should not contain xy
          
          if(a.contains("cd") && (!a.contains("xy"))){
        	  System.out.println("pass");
          }else {
        	  System.out.println("fail");
          }
	}
}
