 package JavaProgs;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6};
		
		int start=0;
		int end=arr.length-1;
		int temp;
		while(start<end) {
			
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}

	}

}
