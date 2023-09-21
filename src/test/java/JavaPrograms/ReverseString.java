package JavaPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String s = "radar";
        String rev = "";
        int len = s.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("Your reverse string is " + rev);

        // Another logic to print string in reverse order.
        String s1 = "Bhavin";
        String revStr1 = "";

        for (int j = 0; j < len - 1; j++) {
            revStr1 = s1.charAt(j) + revStr1;
        }
        System.out.println(revStr1);

        // Using StringBuffer

        String newRev = new StringBuffer(s).reverse().toString();
        System.out.println("Your reverse String using StringBuffer is " + newRev);

        // check if string is palindrome
        if (s.equalsIgnoreCase(rev)) {
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }
    }
}
