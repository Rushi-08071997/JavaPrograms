package JavaProgs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOddTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 2, 3, 4, 5, 5, 4, 5, 6, 6 };

		Map<Integer, Integer> countmap = new HashMap<>();

		for (int it : arr) {

			if (countmap.containsKey(it)) {

				countmap.put(it, countmap.get(it) + 1);
			} else {

				countmap.put(it, 1);
			}

		}
		
		Iterator<Integer> it = countmap.keySet().iterator();

		while (it.hasNext()) {
			 

			Integer key = it.next();
			Integer value = countmap.get(key);
			if(value%2!=0) {
				
				System.out.println(key);
			}

		}
		

	}

}


