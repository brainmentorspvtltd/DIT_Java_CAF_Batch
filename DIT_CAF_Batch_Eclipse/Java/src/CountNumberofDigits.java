
public class CountNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 345, count = 0;
		
		while(n != 0)
		{
			n /= 10; // n = n / 10;
			++count; // 1, 2, 3
		}
		
		System.out.println("Number of Digits: "+count);

	}

}
