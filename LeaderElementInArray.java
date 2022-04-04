public class LeaderElementInArray {
    public static void main(String[] args) {
        int arr[] = { 300, 40, 60, 90, 100, 12, 16, 17, 4, 3, 5, 2 };
        int leader = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > leader) {
                leader = arr[i];
                System.out.println(leader);
            }
        }
    }
}
