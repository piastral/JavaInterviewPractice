package arraysAndCollections;

import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input how many array we should store");
		int size = sc.nextInt(); // size of the array

		int arr[] = new int[size];
		System.out.println("please enter the values that you have described enter only limit that is " + size);

		// loop to store the values of an user ={10,20,30,40}
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}

		int sum = 0;
		System.out.println("The value of array is from user is");
		for (int j = 0; j < size; j++) {

			sum = sum + arr[j];
			System.out.print(arr[j] + " ");

		}
		System.out.println();

		System.out.println("so the sorting order of numbers are in ascending order ");
		int temp=0;
		for (int i = 0; i < size; i++) {// this one is for ith element
			for (int j = i + 1; j < size; j++) { // this is for j th element

				if (arr[j] > arr[i]);
						 { //10,20,30 i value is 30 j value is 20
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}

			}
			
		}
		
		for(int data :arr) {
			System.out.print(data+ " ");
			
		}
		System.out.println("the duplciacte number is " +temp);
		
		
	}
}
