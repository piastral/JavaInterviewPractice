package coreJava1;

public class StringValidation {
    
	
	public static void main(String[] args) {
		
		// 1-method ---length() we are 	this function to check the length of character
		
		String a = "mohammed Qa";
		System.out.println(a.length()); //checking the length of character and gving me the output in terms of integer value
		 // return type is integer
		// 2 -method --startsWith & endsWith validation  it is to check weather the string starting with specific chartacter or not
		
		String b = "mohammed Qa";
		System.out.println(b.startsWith("")); // it gives result validation with true and false // 
		//it also can check with particular char and also the full word
	    System.out.println(b.endsWith("a"));  //imp* all this function belong to string class and 
	    //string class belong to java.langPackage
	    
	    // return type of this method is boolean starts with ends with 
	    
	    String c = "mohammed Qa";
	    System.out.println(c.toLowerCase());
	    System.out.println(c.toUpperCase()); // return type is String only 
	    // 3) toLowerCase & toUpperCase convert string ..this method comes under string class 
	    
	    // 4 ) equals & equalsIgnoreCase 
	    // equals : to verify weather one string is equal to another string 
	    //equalIgnoreCase : verify weather variable is same or not irrespective of case
	    
	    String lok = "RubelDevops";
	    String eq =  "Rubeldevops";
	    System.out.println(lok.equals(eq)); // return type boolean 
	    System.out.println(lok.equalsIgnoreCase(eq));
	    System.out.println(lok.contains("b")); // checks thhat character is ther in data  return boolean
	   /* 
	    String cd = "Excelr";
	    if(cd.startsWith("E")&&cd.contains("x")) {
	    	System.out.println(cd +" has "+ " = " +  "E  and x " );
	    }else {
	    	System.out.println(" : IT CONTAINS: " + cd);
	    }
*/    /*
	    String cd = "Excelr";
	   if(cd.startsWith("E")==true && (cd.contains("x"))==true){
		   System.out.println("pass");
	   }else {
		   System.out.println("fail");
	   }
	 */  
	    String cd = "ExcelR"; 
	    if(cd.length()<7 && (cd.endsWith("lR")) ){
	    	System.out.println("pass");
	    }else {
	    	System.out.println("fail ");
	    }
	    
	    String lk = "Rubel";
	    String e =  "devops";
	    System.out.println(lk.concat(e)); // concat method 
	    // charAt method verify which character is avaialbe at whch index of the string // return
	    
	    String nb = "Rubel";
	    System.out.println(nb.charAt(4)); // returns type char
	    
	    //indexOf : to verify in which index the character is available
	    String cv = "hajar";
	    System.out.println(cv.indexOf("j")); // return type integer
	    
	    String gh = "RubelShahid   ";
	    System.out.println(gh.trim()); // it return string type
	    
	    String rep = "Shahid";
	    System.out.println(rep.replace("d", "n")); // returns string
	    
	    //vvimp method interview question can be easily solved with this particular method
	    // to split variable/string into multiple sub strings 
	    //all split values will ve storing in arrays return type string[]
	    
	    String aim = "Mohammed Java and Selenium Classes";
	    String[] arr = aim.split(" ");
	    for(int i = 0 ; i <arr.length ; i ++) {
	    	System.out.print(arr[i]);
	    	
			}
	    }
	    
	    
	    
	    
	}

