package JavaProgs;

public class IntersectionofArays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,20,23,45,68,90};
		int[] b= {13,28,20,40,10,97};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				if(a[i]==b[j]){
					
					System.out.println(a[i]);
				}
			}
		}

	}

}
