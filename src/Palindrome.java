import java.util.Scanner;

public class Palindrome { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string");
		
		String original = sc.nextLine();
		
		String reverse="";
		
		for(int i=original.length()-1;i>=1;i--)
		{
			reverse=reverse+original.charAt(i);  
		}
		
		System.out.println(reverse);
		
		
		if(original.equals(reverse)) {
			
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
	}

}
