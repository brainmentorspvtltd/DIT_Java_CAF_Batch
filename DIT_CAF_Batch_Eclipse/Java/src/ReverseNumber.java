
public class ReverseNumber {
	public static void main(String[] args) {
		
		int n = 345;
		int rev = 0;
		
//		/ - quotient, % - remainder
		
		while(n > 0)
		{
			int r = n % 10; // 5, 4, 3
			
//			System.out.print(r);
			
			rev = rev * 10 + r; // 5 , 54, 543
			
			n = n / 10; // 34, 3, 0
		}
		
		System.out.println("Reverse Number is: "+rev);
		
	}
}
