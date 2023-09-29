package JavaPrograms;

public class StringOccurance {
    public static void main(String[] args) {
        String inputString = "This is testing string and testing is not easy for testing";
        String[] expArr = {"Testing", "is", "not"};

        System.out.println("---------------------------------------------------------");
        CheckOccurrence(inputString, expArr);
        System.out.println("---------------------------------------------------------");
    }

    public static void CheckOccurrence(String inputString, String[] expArr){
        String[] arr = inputString.split(" ");

        int count = 0;
        for (String s: expArr) {
            for (String string : arr) {
                if (s.equalsIgnoreCase(string)) {
                    count++;
                }
            }
            System.out.println(s + " occurrence is "+count+ " times");
            count = 0;
        }
    }
}
