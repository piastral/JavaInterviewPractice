package arraysAndCollections;

public class Arrays {
	
/* Array := an array is a collection of similar types of data ;java array is an object which contains elements of asimilar
 * data type .Additionally the elements of an array are sorted in contiguous memory location , it is data structure 
 * where we store similar elements
 * disadvantages of array :- we can store only fixed set of elements in array
 * 
 * array is index based ,the first element of the array is stored at the 0th index 2 elements is stored on 1st index
 * and so on..
 * 
 * 	declaration and allocation of array 
 * int[] arr = new int[100];
 */

	public static void main(String[] args) {
		
		int[] arr1 = new int[5]; // Declaration and allocation 
		//how to inilize array 
		int[] arr2 = {10,12,13,14,15,17};
		
		String[] arr3 = {"rubel","hajar","babury"};
		System.out.println(arr3[2]);
		
		int[] number = {1,2,3,4,5};
		for(int i = 0; i<number.length;i++) {
			System.out.println(number[i]);
		}
		
		
	

	}

}
