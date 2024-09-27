package coreJava1;

public class NestedifCondtion {

	public static void main(String[] args) {
     
		int a = 70;
		int b = 120;
		int c=  50;
		int d = 40;
		
		if(a>b && a>c && a>d) {
			System.out.println(  " a is  greater");
		}else if(b>c & b>d){
			System.out.println( "  b is greater");
		}else if (c>d) {
			System.out.println( " c is greater");
		}else {
			System.out.println(" d is greater");
		}
	}

	

}
