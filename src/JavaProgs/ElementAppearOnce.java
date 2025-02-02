  package JavaProgs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ElementAppearOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 1, 4, 4, 3, 2, 2 };

		Map<Integer, Integer> mp = new HashMap<>();

		/*for (int i = 0; i < arr.length; i++) {

			mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
		}

		int res=0  ;

		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {

			if (entry.getValue() == 1) {

				res = entry.getKey();
			}
		}
		System.out.println(res);*/
		for (int i = 0; i < arr.length; i++) {
		if(mp.containsKey(arr[i])) {
			mp.put(arr[i], mp.get(arr[i])+1);
		}else {
			mp.put(arr[i], 1);
		}
		}
		
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {

			if (entry.getValue() == 1) {

			System.out.println(entry.getKey());
			}
		}
		
		
	}

}
