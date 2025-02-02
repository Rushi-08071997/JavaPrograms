package JavaProgs;

import java.util.ArrayList;
import java.util.List;

public class FindMultipleMissingNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 4, 6, 8, 9 };
		System.out.println(findMissingNum(arr));

	}

	public static List<Integer> findMissingNum(int[] arr) {

		List<Integer> lst = new ArrayList<>();
		int expected = arr[0];

		for (int i : arr) {

			while (i > expected) {
				lst.add(expected);
				expected++;
			}
			expected++;
		}

		return lst;
	}

}
