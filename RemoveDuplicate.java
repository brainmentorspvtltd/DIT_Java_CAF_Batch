import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4 };
        // HashSet<Integer> hashSet = new HashSet<>();
        // for (int element : arr) {
        // hashSet.add(element);
        // }
        // arr = new int[hashSet.size()];
        // int index = 0;
        // for (Integer element : hashSet) {
        // arr[index] = element;
        // index++;
        // }
        // for (int element : arr) {
        // System.out.print(element + ",");
        // }
        // System.out.println();

        // Approach-2
        // int arr[] = { 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4 };
        int j = 0; // Prev
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) { // compare prev element with the next element
                j++; // Prev Increment
                arr[j] = arr[i]; // next element is become the prev

            }
        }
        int len = j + 1;
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}
