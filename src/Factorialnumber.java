

public class Factorialnumber{
	
	public static int getfactorial(int num) {
		
		int fact=1;
		if(num==0)
			return 1;
		else
			for(int i=num;i>=1;i--) {
				
					fact=fact*i;
			}
		
		return fact;
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(getfactorial(5));
	}
}


