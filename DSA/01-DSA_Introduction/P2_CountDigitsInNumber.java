public class P2_CountDigitsInNumber {

    // Approach 1 - Iterative Solution
    // static int countDigit(long n) {
    //     int count = 0;
    //     while(n != 0) {
    //         n = n / 10;
    //         count++;
    //     }
    //     return count;
    // }

    // Approach 2 - Recursive Solution
    // static int countDigit(int n) {
    //     if(n == 0) {
    //         return 0;
    //     }
    //     return 1 + countDigit(n / 10);
    // }

    // Approach 3 - Logarithmic Solution
    static int countDigit(int n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }

    public static void main(String[] args) {
        int n = 12345;
        int count = countDigit(n);
        System.out.println("Count is : " + count);
    }
}
