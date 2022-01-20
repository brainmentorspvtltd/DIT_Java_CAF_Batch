
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 371;
		int temp, result = 0;
		
		temp = n;

		while(n != 0)
		{
			int r = n % 10; // 1, 7, 3
			result += Math.pow(r, 3); // 1, 344, 371
			n = n / 10; // 37, 3, 0
		}
		
		if(result == temp)
		{
			System.out.println("It is ArmStrong Number");
		}
		else {
			System.out.println("It is not ArmStrong Number");
		}
		
	}

}
