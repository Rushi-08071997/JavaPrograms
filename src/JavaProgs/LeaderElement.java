package JavaProgs;

public class LeaderElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 92, 7, 12, 9, 8, 3 };
		
		int max=arr[arr.length-1];
		System.out.println(max);
		
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
				System.out.println(max);
			}
			
		}

	}

}
