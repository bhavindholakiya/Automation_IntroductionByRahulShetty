package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        printDuplicateCharacters("banana");
    }

    public static void printDuplicateCharacters(String str) {
        if (str == null) {
            System.out.println("NULL String");
            return;
        }
        if (str.isEmpty()) {
            System.out.println("Empty String");
            return;
        }
        if (str.length() == 1) {
            System.out.println("Single characters in the string");
            return;
        }

        char words[] = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character c : words) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for (Character c : charMap.keySet()) {
            if (charMap.get(c) > 1) {
                System.out.println(c + ": " + charMap.get(c));
            }
        }
    }
}
