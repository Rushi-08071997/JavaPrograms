package JavaProgs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String alpha = "i am am working in cerner cerner";
		// op:- "i am working in cerner"

		String[] arr = alpha.split(" ");

		Set<String> st = new LinkedHashSet<String>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!st.contains(arr[i])) {
				st.add(arr[i]);
			}
		}

		java.util.Iterator<String> it=st.iterator();
		
		while(it.hasNext()) {
			
			System.out.print((it.next())+" ");
		}
	}

}
