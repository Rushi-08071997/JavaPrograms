 package JavaProgs;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ispalindrome(11); 
		

	}
	
	public static void ispalindrome(int num) {
		
		int sum=0;
		int r,t;
		t=num;
		
		while(num>0) {
			
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(t==sum) {
			
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
		
	}

}
