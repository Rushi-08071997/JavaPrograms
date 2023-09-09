public class Armstrong {
	
	//153
			//3*3*3=27
			//5*5*5=125
			//1*1*1=1
			//27+125+153 is an armstrong number

	public static void isarmstrong(int num) {
		
		System.out.println("Given number is " +num);
		
		int cube=0;
		int r=0;
		int t;
		
		t=num;
		
		while(num>0) {
			
			r=num%10; //to get the remainder
			num=num/10; //to get the reduced number
			cube=cube+(r*r*r); //main operation for armstrong number
		}
		
		if(t==cube) {
			
			System.out.println("this is an armstrong number");
		}else
		{
			System.out.println("this is not an armstrong number");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isarmstrong(371);

	}

}
