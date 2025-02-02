package JavaProgs;

public class OnetoHundread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;

		getnum(n);

	}

	public static void getnum(int num) {

		if (num <= 100) {

			System.out.println(num + " ");
			getnum(num + 1);
		}
		
	}

}
