import com.sun.java_cup.internal.runtime.Scanner;

public class Staticblock {
	
	static int B,H;
	static boolean flag = true;
	static {
    	java.util.Scanner sc = new java.util.Scanner(System.in);
    	B = sc.nextInt();
	    H = sc.nextInt();
	    if(B<=0 || H<=0)
        {
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag = false;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}

}
