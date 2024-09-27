package coreJava1;

public class LogicalOperator {
    
	public static void main(String[]args) {
		
		 int a = 15;
    	 int b = 20;
    	 int c = 5 ;
    	 int i = 10 ;
    	 
    	 System.out.println(a!=b || a>(c+i) &&   a>c || b>= c+i); // true 
    	 
    	 System.out.println(a!=b && a>(c+i) &&   a>c &&  b>= c+i); //FALSE 15!=20 =true;15>15= false;15>5= true;true
		//false & true = false ;;; false & true == false
		
	  }
	
 }




