package JavaProgs;

public class PrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isprime(10));
		getprimelist(100);

	}

	public static boolean isprime(int num) {

		if (num <= 1) {

			return false;
		}
		if(num==2) {
			return true;
		}
		if (num % 2 == 0) {
			return false;
		}
		

		return true;

	}

	public static void getprimelist(int num) {
		
        for(int i=2;i<=num;i++) {
			
			if(isprime(i)) {
				
				System.out.println(" "+i);
				
			}
		}
	}

}
