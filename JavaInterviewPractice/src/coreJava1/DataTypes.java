package coreJava1;

public class DataTypes {

	public static void main(String[] args) { 
		
		//PRIMITIVE DATA TYPE
		
		  /*WHAT IS THE DIFFERENCE BETWEEN PRIMITIVE DATA TYPE AND REFRENCE DATA TYPE ??
		   * ANS::PRIMITIVE DATA TYPES ARE::
		   * 1- these data types are pre -defined by java 
		   * 2- the types are fixed eg :: int ,double,char ,boolean
		   * 3-initilized with default values wont be changed
		   * 4- directly stores in memory 
		   * ------------------------------------------------------**********************--------------
		   * REFRENCE DATA TYPES :: 1-and in refrence data types programmers create the class and objects
		   * 2-size not fixed like arrays ,strings 
		   * 3- store the refrence to object that hold the values
		   * 4-datatypes must be explictly initilized by the developer
		   * 
		   */ 
		
		byte a= -12;  	// 1 byte = 8 bits ... it can only store the min -128 to max 127
		byte b = 0;
		System.out.println();
		
		short ab = -3276;  //  size 16 bit = 2 byte ...-32768 to 32767 default value =0
		System.out.println(ab);
		
		int abc =  32525; 	// size 32 bits = 4byte * 8  ..... default value = 0 // suppose i want to store phone number but i cannot since int doenst have that range
		
		long abcd = 3475936123l; // size 64 bits = 8 byte * 8 = 64 def = 0 in the end while writing the data we should mention lat the end of the data
		System.out.println(abcd);
		
		double  abcde = 34587.56; // 8 byte 64 bits requires this data type to store the deimal value
		
	  float c = 345.65f; // 4 byte 32 bits requires the data to store to decimal value to save memory we should always use float 
	  
	  char ch = 'r'; // 2 byte 16 bits // when we want to store the ONLY single character no number
	  
	  boolean bnk = true;  // 1 byte 8 bits // only true or false default value of BOOLEAN VALUE IS = "false"
	  
	
	}
		
	
		 
				
		

}
