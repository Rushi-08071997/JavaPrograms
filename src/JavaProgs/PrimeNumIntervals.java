package JavaProgs;

public class PrimeNumIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//10-70
		
		int low=10;
		int high=70;
		
		while(low < high) {
			
			boolean flag=false;
			
			for(int i = 2;i < (low/2);i++) {
				if(low % i==0) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println(low+" ");
			}
			
			low++;
		}

	}

}
