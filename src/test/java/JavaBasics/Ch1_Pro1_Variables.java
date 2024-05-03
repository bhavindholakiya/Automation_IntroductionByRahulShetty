package JavaBasics;

public class Ch1_Pro1_Variables {
    public static void main(String[] args) {

        int myNum = 5;
        String name = "My name is Bhavin & I'm learning Java";

        /*
        * String is non-primitive data type and int is primitive data type
        * Primitive types are predefined (already defined) in Java.
        * Non-primitive types are created by the programmer and is not defined by Java (except for String ).
        * Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
        * String is primitive data type because String is a class with additional capabilities
        * */

        char letter = 'B';
        double dec = 5.65;
        boolean isActive = true;

        System.out.println(myNum + " is the value stored in the myNum variable");

        System.out.println(name);
    }
}
