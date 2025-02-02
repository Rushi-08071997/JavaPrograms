  package JavaProgs;

public class Squareroor {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		System.out.println(getsquareroot(2147395600));

	}

	public static int getsquareroot(int num) {

		int sum = 0;
		int k = 1;

		if(num<=1) {
			return 1;
		}
		
		while(k*k<=num) {
			k++;
		}
		
		return k-1;

		}

	}


