package JavaProgs;

public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 13, 6, 79, 4, 56, 34 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				int temp;

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}

		System.out.println("The second smallest number in array is " + arr[1]);

	}

}
