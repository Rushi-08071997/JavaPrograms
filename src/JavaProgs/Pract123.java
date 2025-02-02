package JavaProgs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pract123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String tmp="rushikesh";
	        
	        char []chh=tmp.toCharArray();
	        
	        HashMap<Character, Integer> hmap=new  HashMap<Character, Integer>();
	        
	        for(char ch:chh){
	            
	            if(hmap.containsKey(ch)){
	                
	                hmap.put(ch, hmap.get(ch)+1);
	            }else
	                hmap.put(ch, 1);
	            
	        }
	            for(Map.Entry<Character, Integer> mp:hmap.entrySet()){
	                
	                System.out.println(mp.getKey()+": "+mp.getValue());
	            }

	}

}

