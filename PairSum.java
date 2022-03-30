import java.util.Arrays;
import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        // Approach1 N^2
        int arr[] = { 2, 9, 4, 3, 1, 10, 6 };

        int sum = 9;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if ((arr[i] + arr[j]) == sum) {
        // System.out.println("Pair Sum " + arr[i] + " " + arr[j]);
        // return;
        // }
        // }
        // }
        // System.out.println("No Pair Sum found...");
        // Approach-2 Hashing Way
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int element : arr) {
        // if (map.get(element) == null) {
        // int diff = sum - element;
        // map.put(diff, element);
        // } else {
        // System.out.println("Pair Exist " + map.get(element) + " " + element);
        // return;
        // }
        // }
        // System.out.println("No Pair Found...");
        // Approach-3 Two Pointer Approach
        Arrays.sort(arr); // N Log N
        int first = 0;
        int last = arr.length - 1;
        int total = 0;
        while (first < last) {
            total = arr[first] + arr[last];
            if (total == sum) {
                System.out.println("Pair Found " + arr[first] + " " + arr[last]);
                return;
            }
            if (total > sum) {
                last--;
            } else if (total < sum) {
                first++;
            }
        }
        System.out.println("No Pair Sum Found...");
    }
}
