package oopsConcept;
abstract class AbstractClass {  
    private static int count = 0;  
    public AbstractClass() {  
        count++;  
    }  
    public static int getCount() {  
        return count;  
    }  
    public abstract void doSomething();  
}  
class ConcreteClass1 extends AbstractClass {  
    @Override  
    public void doSomething() {  
        System.out.println("ConcreteClass1 doSomething()");  
    }  
}  
class ConcreteClass2 extends AbstractClass {  
    @Override  
    public void doSomething() {  
        System.out.println("ConcreteClass2 doSomething()");  
    }  
}  
public class AbstractExample{  
    public static void main(String[] args) {  
        AbstractClass obj1 = new ConcreteClass1();  
        AbstractClass obj2 = new ConcreteClass2();  
        System.out.println("Number of objects created: " + AbstractClass.getCount());  
    }  
}  

/*An abstract class called AbstractClass contains a constructor that increases the count static private 
 * variable each time a new instance is generated. The class also provides a static method getCount() 
 * that returns the total number of objects generated, as well as an abstract function doSomething() 
 * that needs be implemented by its concrete subclasses.
 * Concrete classes ConcreteClass1 and ConcreteClass2 implement the doSomething()
 *  function and extend AbstractClass.
 *  The getCount() static function of the AbstractClass is used by the Main class to 
determine the total number of objects generated after it produces two objects of various concrete classes.

The count variable is increased by 1 when the constructor of the AbstractClass is 
invoked when

the Main class generates an instance of ConcreteClass1. Similarly,
the constructor of AbstractClass is called once more when an object of 
ConcreteClass2 is generated, increasing the count variable to 2.
 */




 
