import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Switch with String
		//Menu Driven Program
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice:");
		String choice = sc.nextLine();
		
		switch(choice)
		{
		case "one":
			System.out.println("One");
			break;
		case "two":
			System.out.println("Two");
			break;
			
		case "three":
			System.out.println("Three");
			break;
			
		default:
			System.out.println("Invalid Choice");
		}
		
		//System.out.println("Outside the Switch Block");
		
		
		
//		Ternary Operator or Conditional Operator
		
		//Ternary : 3
		
//		?:
//		
//		(Condition) ? True : False;
		
		
		//int a = 1000, b = 2000, c = 3000;
//		
////		&& - And Logical Operator
//		if(a > b && a > c)
//		{
//			System.out.println("A is Greater");
//		}
//		else if(b > c)
//		{
//			System.out.println("B is Greater");
//		}
//		else {
//			System.out.println("C is Greater");
//		}
		
//		String result = (a > b && a > c) ? "A is Greater" : ((b > c) ? "B is Greater" 
//				: "C is Greater");
		
		
		//String status = "day";
//		
//		if(status == "night")
//		{
//			System.out.println("I Sleep");
//		}
//		else {
//			System.out.println("Go for Work");
//		}
		
		//String result = (status == "night") ? "I Sleep" : "Go for Work";
		
//		System.out.println(result);

	}

}
