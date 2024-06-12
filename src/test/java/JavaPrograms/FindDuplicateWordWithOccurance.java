package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWordWithOccurance {
    public static void main(String[] args) {
        String str = "This this is is not Saket saket";
        String lowerStr = str.toLowerCase();
        String[] words = lowerStr.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}