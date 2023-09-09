package JavaProgs;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,8,9};
		
		int k=2;
		int j=0;
		
		while(k>0) {
			
			int temp=arr[arr.length-1];
			
			for(j=arr.length-1;j>0;j--) {
				
				arr[j]=arr[j-1];
			}
			
			arr[j]=temp;
			
			k--;
			
		}

		for(j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

}
