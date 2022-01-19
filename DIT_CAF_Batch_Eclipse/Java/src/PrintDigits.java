
public class PrintDigits {
	
	public static void main(String[] args) {
		
		int n = 345;
		
//		/ - quotient, % - remainder
		
		while(n > 0)
		{
			int r = n % 10; // 5, 4, 3
			
			System.out.println(r);
			
			n = n / 10; // 34, 3, 0
		}
		
	}

}
