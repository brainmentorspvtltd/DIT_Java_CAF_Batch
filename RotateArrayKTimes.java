public class RotateArrayKTimes {
    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int k = 7;
        // range exceed case
        k = k % arr.length;
        // Negative case
        if (k < 0) {
            k = arr.length + k;
        }
        // first part of array reverse
        reverse(arr, 0, arr.length - k - 1);
        // second part of array reverse
        reverse(arr, arr.length - k, arr.length - 1);
        // full array reverse
        reverse(arr, 0, arr.length - 1);
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
