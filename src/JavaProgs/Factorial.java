  
package JavaProgs;

public class Factorial {

	public static void main(String[] args) {
		long fact=getfact(10);
		System.out.println(fact);

	}

	public static int getfact(int num) {
		
		
		int fact =1;
		
		for(int i=num;i>0;i--) {
			fact=fact*i;
		}
		return fact;
		
	}

}
