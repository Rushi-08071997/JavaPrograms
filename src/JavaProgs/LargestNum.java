package JavaProgs;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,8,2};
		
		System.out.println(getlargestNum(arr));
		
		

	}
	
	public static int getlargestNum(int[] arr) {
		
		int max=0;
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				index=i;
			}
			
			
				
		}
		
		for(int i=0;i<arr.length;i++) {
			
			if((arr[i]*2)>max && i!=index) {
				
				return -1;
			}
		}
		
		return index;
		
		
	}

}
