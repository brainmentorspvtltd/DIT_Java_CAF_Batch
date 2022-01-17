
public class EqualsvsEqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "hello";
		String str2 = "Hello";
		
		if(str1.equals(str2)) {
			System.out.println("Str1 is equal to Str2");
		}
		else {
			System.out.println("Str1 is not eqaul to Str2");
		}
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Str1 is equal to Str2");
		}
		else {
			System.out.println("Str1 is not eqaul to Str2");
		}

	}

}
