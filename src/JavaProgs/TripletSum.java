package JavaProgs;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,3,5,23,43,6,7};
		
		int sum=16;
		
		for(int i=0;i<arr.length-2;i++) {
			
			for(int j=i+1;j<arr.length-1;j++) {
				
				for(int k=j+1;k<arr.length;k++) {
					
					if(arr[i]+arr[j]+arr[k]==sum) {
						
						System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
					}
				}
			}
		}

	}

}
