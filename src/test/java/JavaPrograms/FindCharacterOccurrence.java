package JavaPrograms;

import java.util.HashMap;
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
        FC.UsingHashMap(s);
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

    public void UsingHashMap(String s){
        System.out.println("============ Using HashMap =====================");
        HashMap<Character, Integer> charFreqMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : s.toCharArray()) {
            int count = charFreqMap.getOrDefault(ch, 0);
            charFreqMap.put(ch, count + 1);
        }

        // Print the character frequencies
        for (char ch : charFreqMap.keySet()) {
            int count = charFreqMap.get(ch);
            System.out.println("'" + ch + "' occurs " + count + " times");
        }
    }
}