public class BarChartPrint {
    public static void main(String[] args) {
        // given array
        int arr[] = { 1, 2, 5, 9, 7 };
        // find out the max number
        int max = 0;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        // Row Print
        for (int i = max; i >= 1; i--) {
            // Star or Space Print
            for (int j = 0; j < arr.length; j++) {
                if (i <= arr[j]) {
                    System.out.print("*\t"); // print star in same line
                } else {
                    System.out.print("\t"); // print space in same line
                }
            }
            System.out.println(); // add new line

        }
    }
}
