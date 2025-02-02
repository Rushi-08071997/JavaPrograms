package JavaProgs;

public class ShiftEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 8, 5, 3, 1 };
		int[] result = rearrangeEvenOdd(arr);

		for (int i : result) {
			System.out.println(i);
		}

	}

	public static int[] rearrangeEvenOdd(int[] array) {
		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			if (array[left] % 2 == 0) {
				left++;
			} else if (array[right] % 2 != 0) {
				right--;
			} else {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;

				left++;
				right--;
			}
		}
		return array;
	}

}
