package JavaProgs;

public class ArrayPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] num = {1,3,2,4,5};
		
		int sum=5;
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=i+1;j<num.length;j++) {
				
				if((num[i]+num[j])==sum) {
					
					System.out.println("("+num[i]+","+num[j]+")");
					
				}
			}
		}

	}  

}
