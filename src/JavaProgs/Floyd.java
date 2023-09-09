package JavaProgs;

import java.util.Scanner;

public class Floyd {
	
	public static void main(String[] args) {
		
		int c,d,n,l=1;
		
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		for(c=0;c<=n;c++) {
			
			for(d=0;d<=c;d++) {
				
				System.out.print(l+" ");
				l++;
			}
			
			System.out.println(" ");
		}
	}

}
