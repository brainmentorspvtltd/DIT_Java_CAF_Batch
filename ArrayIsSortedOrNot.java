public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 100 };
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                System.out.println("Not Sorted...");
                return; // exit from the function
            }
        }
        System.out.println("Array is Sorted...");

    }
}
