package JavaProgs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FIrstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String abc="programming";
		
		char[] ch=abc.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					
					count++;
					
					}
				
				}
			if(count==0) {
				System.out.println(ch[i]);
				break;
				
			}
		}
	}
}
