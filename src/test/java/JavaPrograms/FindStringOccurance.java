package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindStringOccurance {
    public static void main(String[] args) {
        String inputString = "Testing is important to find defects and testing is carried to test multiple aspects of application and testing decides quality";
        String expectedString = "Testing";
        String[] sList = inputString.split(" ");
        int count = 0;

        for (int i = 0; i <= sList.length; i++) {
            if (sList[i] == expectedString) {
                count++;
            }
        }
        System.out.println(expectedString + "occurs" + count + "times");
    }
}
