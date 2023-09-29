package JavaPrograms;

public class CompareAndCheckCharPresence {
    public static void main(String[] args) {
        String s = "Hello World";
        char[] arr = new char[s.length()];

        for (int i=0; i<arr.length; i++){
            arr[i] = s.charAt(i);
        }

        for (char a : arr){
            if (a == 'o') {
                System.out.println("h is present in given string");
                break;
            }
        }
    }
}
