 package JavaProgs;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {1,2,3,5,6,7,8,9};
		
	   System.out.println(getmissingnumber(num,9));

	}
	
	public static int getmissingnumber(int[] num,int totalcount) {
		
		int expectedsum= ((totalcount*(totalcount+1))/2);
		
		int actualsum=0;
		
		for(int it:num) {
			
			actualsum=actualsum+it;
		}
		
		return expectedsum-actualsum;
	}

}
