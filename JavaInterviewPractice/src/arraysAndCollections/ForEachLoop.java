package arraysAndCollections;

public class ForEachLoop {

	public static void main(String[] args) {
		/*
		 * we can also print the java array using for each loop .the java for each loop
		 * prints the array elements one by one it holds an array element in a variable
		 * then executes the body of the loop
		 * 
		 * syntax for(data_type variable : array){ body of the loop }
		 * 
		 * 
		 */

		/*
		 * int[]arr = {20,50,23,34}; for(int data :arr) { System.out.print(data+" "); }
		 */
		int[] age = {23,34,44,56,22,66,72};
		float sum = 0; 
		for (int i =0;i<age.length;i++) {
			// 0+1 =1 ;
			sum=sum+age[i];
		}
		
		System.out.println("the sum of given array is : " + sum);
		System.out.println("the average of given array is : " +sum/age.length);

	}

}
