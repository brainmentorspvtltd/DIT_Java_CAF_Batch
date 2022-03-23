public class P1_SumOfOdd {
    public static void main(String[] args) {
        
        int sum = 0;
        int n = 5;
        if(n % 2 == 0) {
            return;
        }
        for(int i = 1; i <= n; i++) {
            sum += i;
        }

    }
}