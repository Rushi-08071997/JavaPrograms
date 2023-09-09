package JavaProgs;

import java.util.Scanner;

public class StrRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string");
		
		String one = sc.nextLine();
		
		String reverse = "";
		
		for(int i = one.length()-1;i>=0;i--) {
			
			reverse=reverse + one.charAt(i);
			
		}
		
		if (one.equals(reverse)) {
			
			System.out.println("String is palindrome");
		}else {
			
			System.out.println("String is not palindrome");
		}

	}

}


 
