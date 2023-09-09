package JavaProgs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,1,2,2,2,2,1,2,2,2,1};
		
		
		Map<Integer,Integer> mp=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
				
			}
		int val=arr.length/2;
		
		for(Map.Entry<Integer, Integer> countmap:mp.entrySet()) {
			if(countmap.getValue()>val) {
	        	
	        	System.out.println(countmap.getKey());
	        }
			
		}
		
        
		
		}

	}


