package main.learningjava.oop.encapsulation;

public class EncapsulationMain {

    //Difference between class and object
    /**
     *  A class is a template used for the creation of objects. An object is an instance of a class.
     * */

    //What is encapsulation?
    /**
     * In object-oriented programming, encapsulation refers to the bundling
     * of data with the methods that operate on that data, or the restricting
     * of direct access to some of an object's components
     * */

    //What is instantiating a class?
    /**
     * instantiating a class is creating an object of the class.
     * */

    //Difference between heap and stack memory
    /**
     * The major difference between Stack memory and heap memory is that the stack is used to store the
     * order of method execution and local variables while the heap memory stores the objects and
     * it uses dynamic memory allocation and deallocation.
     *
     * The stack is a region of memory that stores the local variables of a method.
     * The heap is a region of memory that stores the objects.
     * */

    //Stack memory
    /**
     * The stack memory is a physical space (in RAM) allocated to each thread at run time. It is created when a thread creates.
     * Memory management in the stack follows LIFO (Last-In-First-Out) order because it is accessible globally.
     * It stores the variables, references to objects, and partial results. Memory allocated to stack lives until the function returns.
     * If there is no space for creating the new objects, it throws the java.lang.StackOverFlowError.
     * The scope of the elements is limited to their threads. The JVM creates a separate stack for each thread.
     * */

    //Heap memory
    /**
     * The heap memory is a region of memory that stores the objects. It is created when a new object is created.
     * Memory management in the heap follows the First-In-First-Out order because it is accessible globally.
     * It stores the objects and it uses dynamic memory allocation and deallocation.
     * Memory allocated to heap lives until the object is garbage collected.
     * If there is no space for creating the new objects, it throws the java.lang.OutOfMemoryError.
     * The scope of the elements is limited to their threads. The JVM creates a separate heap for each thread.
     * */


    //Difference between encapsulation and abstraction
    /**
     * Abstraction is the method of hiding the unwanted information.
     * Whereas encapsulation is a method to hide the data in a single entity
     * or unit along with a method to protect information from outside.
     * */

    // Why is main method static?
    /**
     * The main method is static because it is called before the object is created.
     * */

    /**
     * The main method is always static because it allows java run time to directly call it
     * without creating an instance of the class.
     * */

    // What are the problems of procedural code?
    /**
     * 1. It is difficult to maintain
     * 2. It is difficult to reuse
     * 3. It is difficult to test
     * 4. It is difficult to extend
     * 5. It is difficult to debug
     * */
    //How does object-oriented  programming help solve these problems?
    /**
     * 1. OOP solves the problem of procedural code by using objects.
     * */

    //What is coupling?
    /**
     * Coupling is the degree of interdependence between software modules.
     *
     * Coupling is nothing but the dependency of one class on the other.
     * If one object in a code uses the other object in the program, it is called loose coupling in Java.
     *
     * Loose coupling is a good practice in Java programming.
     * When two classes, modules, or components have low dependencies on each other,
     * it is called loose coupling in Java.
     *
     * When two classes are highly dependent on each other, it is called tight coupling.
     * It occurs when a class takes too many responsibilities or where a change in one class requires
     * changes in the other class.
     * */


    //What is Constructor on Java?
    /**
     * A constructor is a special method that is used to initialize objects.
     * The constructor is called when an object of a class is created.
     * It can be used to set initial values for object attributes:
     * */

    //Method overloading?
    /**
     * Method overloading is a feature that allows a class to have more than one method having the same name,
     * if their parameters lists are different.
     * It is similar to constructor overloading in Java, that allows a class to have more than one constructor
     * having different parameters lists.
     * */

    //What is the difference between method overloading and overriding?
    /**
     * Method overloading is a feature that allows a class to have more than one method having the same name,
     * if their parameters lists are different.
     * It is similar to constructor overloading in Java, that allows a class to have more than one constructor
     * having different parameters lists.
     *
     * Method overriding is a feature that allows a subclass or child class to provide a specific implementation
     * of a method that is already provided by one of its super-classes or parent classes.
     * When a method in a subclass has the same name, same parameters or signature and same return type(or sub-type)
     * as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
     * */

    //What is static method?
    /**
     * A static method is a method that is bound to the class and not the object of a class.
     * A static meth`od can be invoked without the need for creating an instance of a class.
     * A static method can access static data member and can change the value of it.
     * */

    public static void main(String[] args) {
        Employee encapsulation = new Employee(50_000, 20);
        int wage = encapsulation.calculateWage(20);
        System.out.println(wage);
        var browser = new Browser();
        browser.navigate("www.google.com");
    }
}
