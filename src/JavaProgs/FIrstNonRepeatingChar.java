package JavaProgs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FIrstNonRepeatingChar {
	
	public static int getFirstUniqueChar(String abc) {
		     char ch = 0;
		    Map<Character,Integer> mp = new LinkedHashMap<Character,Integer>();
			
			for(int i=0;i<abc.length();i++) {
				char chh=abc.charAt(i);		
					mp.put(chh, mp.getOrDefault(chh,0)+1);
	        }
			for(Map.Entry<Character, Integer> countmap:mp.entrySet()) {
				if(countmap.getValue()==1) {
		        	 ch =countmap.getKey();
	                 break;
		        }
			}
			return abc.indexOf(ch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="programming";

		System.out.println(getFirstUniqueChar(str));

}
}
	

