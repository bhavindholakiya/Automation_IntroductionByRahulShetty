package JavaBasics;

public class Ch1_Pro6_StringInJava {
    public static void main(String[] args) {
        // Q. What is String in Java?
        // => In JAVA Terminology, String is an Object in Java that represents sequence of characters.

        // Q. How many ways you can define String?
        // => There two ways to define a String by Literal and New Keyword to allocate memory in Java Memory.
        // Using String literal - If the variables value same then it wont use Java memory for those variable.

        String s = "My Name is Bhavin Dholakiya";
        String S1 = "My Name is Bhavin Dholakiya";

        //Using New Keyword - It will allocate memory for each String variable or Object even the variables value is same.
        String S2 = "Bhavin";

        // Split method to break a String by regex
        String[] splittedString = s.split(" ");
        for ( String val :splittedString)
        {
            System.out.println(val);
        }
        System.out.println("-----------------------------------------------------------");

        String[] splittedString1 = s.split("is");
        System.out.println(splittedString1[0]);
        System.out.println(splittedString1[1].trim());

        System.out.println("--------------- Print String in Reverse Order -------------");
        System.out.println("Original String is: "+s);

        String reversedString = "";

        for (int i=s.length()-1; i>=0; i--)
        {
            reversedString = reversedString+s.charAt(i);
        }
        System.out.print("Reversed String is "+reversedString);

        System.out.println("----------- Print String Words in Reverse Order -----------");


    }
}
