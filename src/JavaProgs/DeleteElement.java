package JavaProgs;

import java.util.Arrays;
import java.util.List;

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 5, 6, 8, 40, 9 };
		removeElement(arr, 40);

	}

	public static void removeElement(int[] arr, int num) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == num) {

				List<int[]> lst = Arrays.asList(arr);

				lst.remove(i);
				System.out.println(lst);

			}

		}

	}

}
