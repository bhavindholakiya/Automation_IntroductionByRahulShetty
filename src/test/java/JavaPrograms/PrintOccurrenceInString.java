package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class PrintOccurrenceInString {
    public static void main(String[] args) {
        String inputString = "aabcddbbc";

        // output = a2b3c2d2

        Map<Character, Integer> charCountMap = new HashMap<>();

        for(char ch : inputString.toCharArray()){
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0)+1);
        }

        StringBuilder newString = new StringBuilder();
        for(Map.Entry<Character, Integer> entry: charCountMap.entrySet()){
            newString.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println("Output string is: "+newString);
    }
}
