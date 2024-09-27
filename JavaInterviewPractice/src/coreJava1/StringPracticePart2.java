package coreJava1;

public class StringPracticePart2 {
	/*
	 * String is immutable ...but StringBuilder and StringBuffer is mutable
	 * String builder and buffer objects gets stored in heap memory 
	 * 
*-----------------------------------------------------------------------------------------------
*STRING CONSTANT POOL --- IS SPECIAL MEMORY AREAS 
*difference between equal method and ==operator 
*-----------------------------------**********___________________
*immutable ::: when we create string object it can not be  change in future ,if we try to change that string new
*string get created with those changes ...
*   ---String s ="ammi";
*   ----String s1 = new String("ammi");
*   let say for an example we use one string method concat and we want t add "mother"
*   so how it will look s.concat("mother");// output of these will be ammimother 
*   +++++++++++ but in scp areas new string value will be created it will be --"ammimother"+++++++++
*   so basically in SCP it will have two values not one values 1st "ammi and "ammimother".
*   and the respectedmemory will be allocated for two values.....this is the concept of IMMUTABLE
*   -----------------------------***************************************-----------------------------------
*   
*  
*   /-- ----------------------***********-----------------------
*VVIMP BEFORE JAVA 1.8 VERSION THE SCP WAS IN METHOD AREAS ,AFTER 1.8 IT SHIFTED INSIDE HEAP AREAS 
*IN METHOD AREAS ALL THE STATIC VARIABLE GETS STORED ....
*
*--- NOW SCP (STRING CONSTANT POOL ) INSIDE HEAP AREAS WHEN WE CREATE STRING 
*weith using string literal it gerts stored in SCP ..
*when we create a string with the new keyword it gets stored in heap areas 
*
*---------------------------------------********************************---------------------------------
*WHY STRINGS ARE IMMUTABLE  ?
*ANS:::String s1 = new String("HOLA"); // in memory areas 2 objects will e created one in HEAP and One in 
*SCP which is inside the heap ...So in heap areas the objetc  "HOLA" reffred by s1 variable 
*and another object which is inside the scp gets reffred by JVM (INTERNALLY using some parameter refrence )
*
*NOW with same refrence if i want to use concat  method for example 
*s1.concat("BOLA")//so in heap area it will be created as "HOLABOLA" as 2nd object 
*but no one will refer this meaning not s1 also and not JVM also but the memory will be given to use this objetc 
*but lets say if the memory get less garbage collector will remove the 2nd object 
*but since we are using as lieral the "BOLA" it will be also created in scp and will be reffred by JVM 
*
*-----------------------------&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&----------------------------------------------
*now for an example we are using s=s1.concat("JAVA") now we are assiging the s1 to s now s will start 
*reffreing for "HOLAJAVA" ...so techinally in heap area s---->point or refer to "HOLAJAVA" as an object 
*-----------------------------------------------TECHINAL PLEASE READ IT NICELY---------------------------
*
*NOW FOR AN EXAMPLE IF WE REFER WITH THE SAME NAME LIKE S1=S1.CONCAT("JAVA"); NOW IN MEMORY AREAS
*THINGS WILL CHANGE BEFORE THE S1 WAS REFFREING TO "HOLA" ....NOW S1---->REFER TO "HOLAJAVA"
* -----------------------------------------------------------------------------------------------------
*now lets say we are using string literal ====VIMP TOPIC 
*and we have 3 person ..p1 ,p2 ,p3
*
*String p1="Java developer";
*String p2= "Java developer";
*String p3="Java developer"; //same concept same value 
*now in scp when the object java developer will be created only 1 object will be created in SCP
*AND ALL THE REFRENCE VARIABLE P1,P2,P3 will only refer to 1 object java developer it means there wont be three
*objects only 1 object will be reffred three refrence variable .
*so in this way it is effiecnt to save the memory the less the objects the more the speed of the projects
*---------------------------------------------
* AND NOW SUDDENLY P1 BECOMES String P1="Java Trainer"; so the concept changed right object changed 
* in this case new object will be created in scp  as "Java Trainer"; and p1 will refer to "Java trainer 
*this proves that why strings are immutable ...to save the memory by not creating n number of objects
*rather refering to the same objects 
*
*----------------------------------------------*-----------------------------------------------
*String gh = new String("mohammed");
*String vh  = new String("mohammed")
*in heap areas 2 object will be created with the same name of the object "mohammed" and will be reffred by 
*their respective variable name 
*-------------------------------------------------------------
*now in scp after the first object gets created "mohammed" no duplicate object will be created .
*and since the object is already created the help of new keyword ----in scp the object "mohammed
*------> reffered by JVM INTERNALLY 
*
* END ,,,,
* 
* ----
* ----------------------------------------***************************-------------------------------------
* DIFFERENCE BETWEEN EQUAL() method  AND == OPERATOR ??
* ANS::lets say 10 == 20 // what it will return false ..and return boolean value
*
*String s1 = "mohammed";
*String s2 = "mohammed";
*now s1 == s2 // what is the output the output wil be "TRUE"
*because == operater will check the memory address not the object because both the reference variable
*are pointing to the same location rather saying same object ....this also proves that 
*strings are immutable meaninf meaning f there is duplicate object it will be created only once 
*-------------------------------
*Now String s3 = new String("mohammed ");
*    s1==s3 //output returns false 
*    because it check the memory address not the content as we know with new keyword it gets created in 
*    HEAP AREA AND SCP in this case in SCP it will noot be creatred because of the duplicate object 
*    and the address in heap area where it will be created  is different from the address in SCP AREAS
*    -----------------------------------++++++++++++++++++------------------------------
*    EQUAL METHOD() WILL CHECK THE CONTENT OF THE STRING 
*    
*    
*
*
* 
* 
* ----------------------------------------------++++++++++++++++++++++++---------------------------------
*/
	

	public static void main(String[] args) {
	/*	String ss = "mohammed "; // using string literal

		String s1 = new String("mohammed"); // using new keyword

		StringBuffer sb = new StringBuffer(); // it stores in heap memory nly

		StringBuilder sf = new StringBuilder(); // it stores only in heap memory

		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		String sss = new String(c);
		
	----------------------------------------------------------------------------------------	
		
		*/
		
		
		String sa = "haj";
		
		System.out.println(sa.length());
		
		String s1 = "mohammed";
		String s2 = new String("mohammed");
		String s3 = "mohammed";
		System.out.println(s1==s2); // what is the output ?? output is false 
		 //lets check the memory address by using hascode method 
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		
		String ss = "mohammed";
		String sb = "mohammed";
		System.out.println(ss.equals(sb)); // equal method is only checking the content not the memory address
		
		
	}
}
