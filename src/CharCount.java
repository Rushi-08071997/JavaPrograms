 
public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="I love coding & testing";
		
		charoccurance(str,'o');
		getcount(str,'g');
		
		

	}
	
	public static void charoccurance(String str,char val) {
		
		int count=0;
		
		for(char ch:str.toCharArray()){
			
			if(ch==val) {
				
				count++;
				
			}
			
		}
		System.out.println(val+": "+count);
	}	
		
		public static void getcount(String str,char val) {
			
			int count=0;
			
			for(int i=0;i<str.length();i++) {
				
				if(str.charAt(i)==val) {
					
					count++;
				}
			}
		System.out.println(val +":" +count);
	}

}
