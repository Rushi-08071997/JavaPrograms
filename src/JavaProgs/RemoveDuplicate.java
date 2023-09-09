package JavaProgs;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 1, 5, 4, 2, 6,6,6,67 };

		Map<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (mp.containsKey(arr[i])) {

				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {

				mp.put(arr[i], 1);
			}
		}
		java.util.Iterator<Integer> it = mp.keySet().iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}
