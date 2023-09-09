   public class MissingNumber{
	
	
	public static void main(String[] args) {
		
		int []num = {1,2,3,4,5,6,7,9};
		
		System.out.println(getmissingnumber(num,9));
		
		
		
	}
	
	public static int getmissingnumber(int[] num,int  totalcount) {
		
		int expectedsum =((totalcount * (totalcount+1))/2);
		
		int actualsum=0;
		
		for(int i:num) {
			
			actualsum=actualsum+i;
		}
		
		return expectedsum-actualsum;
		
	}
	}
