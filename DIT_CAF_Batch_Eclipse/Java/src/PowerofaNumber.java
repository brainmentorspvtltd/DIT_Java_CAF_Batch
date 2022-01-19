
public class PowerofaNumber {
	
	public static void main(String[] args) {
		
		int base = 2, exponent = 3;
		int result = 1;
		
		while(exponent != 0)
		{
			result *= base; // result = result * base;
			exponent--;
		}
		
		System.out.println("Power of a Number is: "+result);
		
	}

}
