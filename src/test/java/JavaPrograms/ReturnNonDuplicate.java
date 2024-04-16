package JavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReturnNonDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6,7,8,9,9,9,10};
        Set<Integer> uniqueValues = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (uniqueValues.contains(num)) {
                result.remove(Integer.valueOf(num));
            } else {
                uniqueValues.add(num);
                result.add(num);
            }
        }
        System.out.println(result); // Output: [1, 3, 5]
    }
}
