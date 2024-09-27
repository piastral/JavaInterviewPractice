package coreJava2;

public class AcessSpecifer2 {

	public static void main(String[] args) {
		System.out.println(AcessSpecifier.a);//public class can be acesses in different class
		System.out.println(AcessSpecifier.b);//protected class can be acess in diffrent classwithin same package 
		System.out.println(AcessSpecifier.d); // default class can be acess in different class within same package
		
     // private class we cannot access because it only works within same class.
	}

}
