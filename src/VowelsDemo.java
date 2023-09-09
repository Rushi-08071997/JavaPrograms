import java.util.Scanner;

public class VowelsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string");
		
		String Given=sc.nextLine();
		
		char []chars = Given.toCharArray();
		
		int count=0;
		
		for(char c:chars) {
			
			switch(c) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			
			count ++;
			
			break;
			
			}
			
		}
		 
		System.out.println("number of vowels are "+ count);
		
		
		
		

	}

	

}
