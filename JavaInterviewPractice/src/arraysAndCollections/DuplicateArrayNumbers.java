package arraysAndCollections;

public class DuplicateArrayNumbers {

	public static void main(String[] args) {
		boolean toCheck = false; // default
		int arr[] = { 11, 22, 23 ,44,44 };
				
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("duplicate number is ::" + arr[i]);
					toCheck = true;
				}
				
			}
		}
		if (toCheck == false) {
			System.out.println("duplicate element is not found");
		}

	}
}