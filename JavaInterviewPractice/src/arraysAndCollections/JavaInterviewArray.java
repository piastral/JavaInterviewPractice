package arraysAndCollections;

import java.util.Scanner;

public class JavaInterviewArray {

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
		System.out.println("The value of stored array is from user is");
		for (int j = 0; j < size; j++) {
			
			sum = sum + arr[j];
			System.out.print(arr[j]+ " ");
			
		}
		System.out.println();
		
		System.out.println(" The value of array  is : "+sum);
		System.out.println(" The average value of total sum  is :" +sum/size);
		
		System.out.println();

		System.out.println("the addition is " + sum);
		
        System.out.println(); 
        
		System.out.println("reverse order is");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print( arr[i]+" ");
		}

	}
}
