package coreJava1;

public class ConditionalOperator {
	
	
     public static void main(String[]args) {
	  
    	 int a = 15;
    	 int b = 20;
    	 int c = 5 ;
    	 int i = 10 ;
    	 //conditional operator verify /check the condition of the statement and always give boolean result
    	 
    	 System.out.println(a++ + a > --a + a++); //15 + 16 > 15 + 15 == //  31 > 30  true
    	 System.out.println(a++ + a++ <= --a + a++); // 16 + 17 <= 17 + 17 ....33 <= 34  //true
    	 System.out.println(i++ >= i); // 10 >= 11 // false
    	 System.out.println(a+i); // 29 value
    	
    	 
  } 
     
     
}
