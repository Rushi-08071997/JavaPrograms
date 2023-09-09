public class Primenumbers{
		
		
		public static boolean isprime(int num) {
			
			if(num<=1) {
				return false;
			}
			
			for(int i=2;i<num;i++) {
				
				if(num%2 == 0) {
					
					return false;
				}
			}
			
			return true;
		}
		
		public static void getprimenos(int num) {
			
			System.out.println("The list of prime number upto " + num +" is ");
			for(int i=0;i<=num;i++) {
				if(isprime(i)) {
					System.out.print(" "+i);
				}
				
			}
		}
		
		public static void main(String[] args) {
			
			System.out.println(isprime(7));
			getprimenos(120);
		}
		
		
	}


