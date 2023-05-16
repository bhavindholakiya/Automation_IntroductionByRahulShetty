package JavaPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String s = "radar";
        String rev = "";
        int len = s.length();

        for(int i = len-1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("Your reverse string is "+rev);

        // Using StringBuffer

        String newRev = new StringBuffer(s).reverse().toString();
        System.out.println("Your reverse String using StringBuffer is "+newRev);

        //check if string is palindrome
        if (s.equalsIgnoreCase(rev)){
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }
    }
}
