import java.awt.SystemColor;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicatecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		 
		
		System.out.println(removeduplicate(str));
		
	}
		
		public static String removeduplicate(String str) {
			
			Set<Character> st =new HashSet<>();
			
			StringBuffer sf = new StringBuffer();
			
			for(int i=0;i<str.length();i++) {
				
				Character c=str.charAt(i);
				
				if(!st.contains(c)) {
					
					st.add(c);
					sf.append(c);
				}
				
				
			}
			
			return sf.toString();
			
			
			

	}

}
