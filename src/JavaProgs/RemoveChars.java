package JavaProgs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alpha = "cerner";
		// op:- "i am working in cerner"

		char[] arr = alpha.toCharArray();

		Set<Character> st = new LinkedHashSet<Character>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!st.contains(arr[i])) {
				st.add(arr[i]);
			}
		}
		
		
		System.out.println(st.toString());

	}

}
