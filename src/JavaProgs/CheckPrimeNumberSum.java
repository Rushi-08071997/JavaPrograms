package JavaProgs;

import java.util.Scanner;

public class CheckPrimeNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
	boolean flag=false;
	for (int i = 2; i <= num / 2; i++) {
		if(checkprime(i)) {
			if(checkprime(num-i)) {
				
				System.out.println(num+"="+i+" + "+(num-i));
				flag=true;
			}
		}
	}
	if(!flag) {
		
		System.out.println(num+" can not be expressed as the sum of two prime nos.");
	}
	
	

	}

	public static boolean checkprime(int num) {

		boolean isprime = true;

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				isprime = false;
				break;
			}
		}

		return isprime;
	}

}
