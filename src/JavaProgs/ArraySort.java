package JavaProgs;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,4,5,3,1,9};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;	j++) {
				
				if(arr[i]>arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
        for(int k=0;k<arr.length;k++) {
        	System.out.println(arr[k]);
        }
	}

}
