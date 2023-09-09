
public class Armstrong2 {

	
	public static void isarmstrong(int num) {
		
		
		System.out.println("The given number is "+num);
		
		int cube=0;
		int r=0;
		int t;
		
		t=num;
		while(num>0) {
			
			r= num%10;
			num=num/10;
			cube=cube+(r*r*r);
			
		}
			
			if (t==cube) {
				
				System.out.println("The given number "+t +" is armstrong");
			}else {
				
				System.out.println("The given number "+t +" is not armstrong");
			}
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isarmstrong(123);

	}

}
