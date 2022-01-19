
public class ReverseString {

	public static void main(String[] args) {
		
		char name[] = {'R', 'a', 'm'};
		
		// two pointer approach
		
		int i = 0;
		int j = name.length - 1;
		
		while(i < j)
		{
			char temp = name[i];
			name[i] = name[j];
			name[j] = temp;
			
			i++;
			j--;
		}
		
		//enhanced for loop
		for(char n : name)
		{
			System.out.print(n);
		}
		
	}
	
}
