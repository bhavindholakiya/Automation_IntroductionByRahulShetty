package JavaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumericValues {
    public static void main(String[] args) {
        String input = "ABC 123 Hello 32";
        int sum = 0;

        // Extract all the numeric values from the string using regular expressions.
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        // Iterate over all the numeric values and add them to the sum.
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

        // Print the sum of all the numeric values.
        System.out.println("Sum of all the numeric values: " + sum);
    }
}
