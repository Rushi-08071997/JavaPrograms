package JavaProgs;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getsum(12345);

	}
	
	public static void getsum(int num) {
		
		int sum=0;
		int r;
 		
		while(num>0) {
			r=num%10;
			num=num/10;
			sum=sum+r;
		}
		
		System.out.println(sum);
		
	}

}
