package JavaProgs;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="rushi";
		String str2="roshi";
		boolean isboolean=false;
		
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)) {
				isboolean=false;
				break;
			}
			
			isboolean=true;
			
		}
		
		System.out.println(isboolean);
		
		

	}

}
