package JavaProgs;

import java.util.HashMap;
import java.util.Map;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String abc="Programming";
		
		char[] arr=abc.toCharArray();
		
		
		Map<Character,Integer> countmap=new HashMap<>();
		
		for(char ch:arr) {
			
			if(countmap.containsKey(ch)) {
				
				countmap.put(ch, countmap.get(ch)+1);
			}else {
				
				countmap.put(ch, 1);
			}
			
		}
		
		System.out.println(countmap);

	}

}
