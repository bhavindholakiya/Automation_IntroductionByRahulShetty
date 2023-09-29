package JavaPrograms;

public class StringOccurance {
    public static void main(String[] args) {
        String inputString = "This is testing string and testing is not easy for testing";
        String expectedString = "Testing";
        int count = 0;

        String[] arr = inputString.split(" ");
        for (String a : arr) {
            if (a.equalsIgnoreCase(expectedString)){
                count++;
            }
        }
        System.out.println(expectedString + " occurrence is "+count+" times");
    }
}
