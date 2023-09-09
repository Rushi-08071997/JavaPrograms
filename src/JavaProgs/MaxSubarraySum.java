package JavaProgs;

public class MaxSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, -5, 4, 3, 8, 5 };

		int maxsum = arr[0];
		int sum = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (sum < 0) {
				sum = arr[i];
			} else {

				sum = sum + arr[i];
			}
		}

		maxsum = Math.max(sum, maxsum);

		System.out.println(maxsum);

	}

}
