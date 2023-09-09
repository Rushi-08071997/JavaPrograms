package JavaProgs;

public class RemoveDupsBrute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =  {1,2,3,3,4,4,5,5};
		
		int[] temp = new int[arr.length];
		
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				
				temp[j]=arr[i];
				j++;
			}
		}
		
		temp[j++]=arr[arr.length-1];
		
		
		for(int k=0;k<j;k++) {
			
			System.out.println(temp[k]);
		}

	}

}
