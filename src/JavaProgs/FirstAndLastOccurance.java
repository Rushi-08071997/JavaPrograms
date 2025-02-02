package JavaProgs;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 10, 5, 2, 7, 2, 5, 7, 8, 9, 2 };
		int num = 2;
		int[] res = findelements(arr, num);
		for (int i : res) {
			System.out.println(i);
		}

	}

	public static int[] findelements(int[] arr, int num) {

		int[] result = new int[2];
		// Find first and last occurrence
		int firstIndex = -1;
		int lastIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				if (firstIndex == -1) {
					firstIndex = i; // Set the first occurrence
				}
				lastIndex = i; // Update the last occurrence
			}
		}

		result[0] = firstIndex;
		result[1] = lastIndex;

		return result;

	}

}
