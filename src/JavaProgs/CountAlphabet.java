package JavaProgs;

public class CountAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tmp="gSyiFDgq";
		
		int uppercase=0;
		int lowercase=0;
		
		char[] ch=tmp.toCharArray();
		
		for(char chh:ch) {
			
			if(chh>='A' && chh<='Z') {
				
				uppercase++;
			}else
				
				lowercase++;
		}
		
		System.out.println("Count of uppercase letters: "+uppercase);
		System.out.println("Count of lowercase letters: "+lowercase);

	}

}
