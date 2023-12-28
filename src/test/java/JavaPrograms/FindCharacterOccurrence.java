package JavaPrograms;

import java.util.Scanner;

public class FindCharacterOccurrence {
    public static void main(String[] args) {
    	String s = "useRecursionToCountChars";
    	
    	Scanner scn = new Scanner(System.in);
        System.out.println("Please enter character to find occurrence: ");
        char ch = scn.next().charAt(0);
    	
    	FindCharacterOccurrence FC = new FindCharacterOccurrence();
    	FC.TraditionalMethod(s, ch);
    	FC.UsingStream(s, ch);
    }

    public void TraditionalMethod(String s, char inputChar){
    	System.out.println("============ Traditional Method =====================");
        int count = 0;      
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == inputChar) {
                count++;
            }
        }
        System.out.println("Occurrence of "+inputChar+ " is " +count);
    }
    
    public void UsingStream(String s, char inputChar){
    	System.out.println("============ JAVA 8 Features =====================");
    	long count = s.chars().filter(ch -> ch == inputChar).count();
    	System.out.println("Occurrence of "+inputChar+ " is " +count);
    }
}