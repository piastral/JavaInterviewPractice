package arraysAndCollections;

public class DuplicateArray {

	public static void main(String[] args) {
		String arr[] = {"rubel","shahid","java","java"};
		
		for(int i = 0 ;i <arr.length;i++) {
			
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("the duplicate element is :"+arr[i]);
				}
				System.out.println("check how many times j gets  prints "+arr[j]);
			}
			System.out.println("check how many times i gets printed "+arr[i]);
		}

	}

}
