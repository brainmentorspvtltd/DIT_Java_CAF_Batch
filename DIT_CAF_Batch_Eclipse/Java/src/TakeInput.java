import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any Integer:");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter any String:");
		String b = br.readLine();
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter any Integer:");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter any String:");
//		String b = sc.nextLine(); // it takes input until we press enter
//		//String b = sc.next(); // it will take input before space
		
		System.out.println("You have entered "+a+" "+b);

	}

}
