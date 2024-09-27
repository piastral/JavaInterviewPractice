package oopsConcept;

public sealed interface Moha permits Mohammed1{
	void show();

	void m1();
}

//// now ill use sealed interface sealed interface is interface it restricts implement to the classes
// until and unless permisssion is given to implement
//any class which implements sealed interface should be definedd as final class,sealedclass,
//nonsealedclass why we do sealed ans :: for the security purpose 
//for an example if we are using non sealed class after implementing from interface ,that means 
//we are also denoting that class can be extended in future ...but if i use FINAL thats it 
//we cannot use that class

 

