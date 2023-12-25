package JavaPrograms;

public class FindCharacterOccurrence {
    public static void main(String[] args) {
        String s = "useRecursionToCountChars";
        char c = 'u';
        int count = 0;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Occurrence of "+c+ " is " +count);
    }
}
