package JavaProgs;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "OOT";
		String str2 = "TOP";

		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {

			System.out.println("Strings are anagrams");
		} else

			System.out.println("Strings are not anagrams");

	}

}
