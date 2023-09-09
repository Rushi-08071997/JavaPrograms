package JavaProgs;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getComElements();  

	}

	public static void getComElements() {

		int[] a = { 1, 2, 30, 45, 60 };
		int[] b = { 2, 10, 45, 50, 80 };
		int[] c = { 1, 2, 5, 45, 70, 90 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < b.length - 1; j++) {
				for (int k = 0; k < c.length - 1; k++) {

					if (a[i] == b[j] && b[j] == c[k]) {

						System.out.println(a[i] + " ");
					}
				}
			}
		}

	}

}
