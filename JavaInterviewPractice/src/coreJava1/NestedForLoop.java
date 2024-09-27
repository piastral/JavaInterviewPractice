package coreJava1;

public class NestedForLoop {

	public static void main(String[] args) {
		
     
	// main objective of nested loop is for every main loop for every iteration of main loop sub loop will
		// will complete its journey or its cycle and than main loop condtion will start working
			
		 for(int i = 1 ;i <5;i++) {
			 for(int j= 1;j<5;j++) {
				for(int k = 1; k<5;k++) {
					 System.out.println(i+ " - " +j+"- "+k);
				}
			 }
		 }
		 System.out.println("eod");
		}

	}


