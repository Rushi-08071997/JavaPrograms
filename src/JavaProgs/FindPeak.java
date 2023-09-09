package JavaProgs;

public class FindPeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,6,7,8,9};
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				
				System.out.println(arr[i]);
			}
			}
		System.out.println(arr[arr.length-1]);
		}

	}


