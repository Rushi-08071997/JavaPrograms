
public class DuplicateChar {

	public static void main (String[] args) {
		
		
		String str="indiaismycountry";
		
		getcount(str);
	}


	public static void getcount(String str) {
		
		if(str==null) {
			System.out.println("null string");
			
			return;
		}
		
		if (str.isEmpty()) {
			
			System.out.println("string is empty");
			
			return;
		}
		
		if(str.length()==1) {
			System.out.println("single char string");
			return;
		}
		
		char[] arr=str.toCharArray();
		
		 
		
		
		for(int i=0;i<arr.length;i++) {
			
			int count=1;
				
			for(int j=i+1;j<arr.length;j++) {
				
				
				if(arr[i]==arr[j]) {
					
					count++;
					
					System.out.println(arr[i] + ":" +count);
				}
			}
		}
	}
}
