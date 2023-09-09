 
public class Palindromenumber {

	
	public static void ispalindrome(int num) {
		
		System.out.println("The given number is "+num);
		
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		
		while(num>0) {
			
			r=num % 10; //to get the remainder
			sum=(sum*10) +r;
			num=num/10;	
   		}
		if(t==sum) {
			System.out.println("palindrome number");
		}else
			System.out.println("Not a palindrome number");	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ispalindrome(987789);

		}

}
