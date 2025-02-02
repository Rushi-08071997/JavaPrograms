 package JavaProgs;

import java.util.HashMap;
import java.util.Map;

public class DigitFrequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getFrequency(15265);

	}
	
	
	public static void getFrequency(long num) {
		
		HashMap<Long, Integer> digitmap=new HashMap<>();
		
		while(num>0) {
			
			long lastdigit=num%10;
			
			if(digitmap.containsKey(lastdigit)) {
				
				digitmap.put(lastdigit, digitmap.get(lastdigit)+1);
			}else {
				digitmap.put(lastdigit, 1);
			}
			
			num=num/10;
			
		}
		
		
		for(Map.Entry<Long, Integer> mp:digitmap.entrySet())
		{
			System.out.println(mp.getKey()+":"+mp.getValue());
		}
	}

}
