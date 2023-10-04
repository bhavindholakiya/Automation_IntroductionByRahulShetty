package Abstraction;

public abstract class Vehicle {

    int noOfWheel;

    abstract void start();

    /*
    * 1. Abstraction is hiding internal implementation and just highlighting the setup services that we are offering.
    * 2. Data abstraction deals with exposing the interface to the user and hiding the details of implementation.
    * 3. A method without body (no implementation) is known as abstract method.
    * 4. A method must always be declared in an abstract class, or we can say that if a class has an abstract method,
    *  it should be declared abstract as well.
    * 5. If regular class extends an abstract class, then the class must have to implement all the abstract methods
    * of abstract parent class OR it has to be declared abstract as well.
    * 6. Abstract methods in an abstract class are meant to be overridden in derived concrete classes otherwise
    * compile time error will be thrown.
    * 7. Abstract classes cannot be instantiated, means we can't create an object of abstract class.
    * 8.
    * */
}