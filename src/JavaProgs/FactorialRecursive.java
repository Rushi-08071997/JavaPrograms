
package JavaProgs;

public class FactorialRecursive {
	
	public static void main(String[] args) {
		
		
		System.out.println(multiply(4));
		
	}
	
	
	public static int multiply(int num) {
		
		if(num>0) {
			
			return num * multiply(num-1);
		}else
			return 1;
	}

}
