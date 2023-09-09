package JavaProgs;

public class Segragate {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 0, 2, 2, 1, 1 };

		int zerocount = 0;
		int onecount = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0)
				zerocount++;

			if (arr[i] == 1)

				onecount++;

		}

		for (int i = 0; i < zerocount; i++) {
			arr[i] = 0;
		}
		for (int i = zerocount; i < (zerocount + onecount); i++) {

			arr[i] = 1;
		}

		for (int i = (zerocount + onecount); i < arr.length; i++) {
			arr[i] = 2;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}

	}

}
