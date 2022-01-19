import java.util.Scanner;

public class ReplaceAllVowels {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String:");
		String str = sc.nextLine();
		
		System.out.println(str.replaceAll("[AaEeIioOuU]", "X"));
		
//		char ch[] = str.toCharArray();
//		
//		for(int i = 0; i < ch.length; i++)
//		{
//			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' 
//					|| ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' 
//					|| ch[i] == 'O' || ch[i] == 'U')
//			{
//				ch[i] = 'X';
//			}
//		}
//		
//		for(char i : ch)
//		{
//			System.out.print(i);
//		}
	}

}
