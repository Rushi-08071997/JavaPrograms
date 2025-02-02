 package JavaProgs;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getarm(153);// 1+125+27

	}

	public static int getnumcount(int num) {
		
		System.out.println(Integer.bitCount(1));
		

		int count = 0;

		while (num > 0) {

			num = num / 10;
			count++;
		}

		return count;
	}

	public static void getarm(int num) {

		double result = 0;
		int r = 0;
		int j;
		j = num;

		while (num > 0) {

			r = num % 10;
			num = num / 10;
			result = result + Math.pow(r, getnumcount(j));
		}
		if (result == j) {
			System.out.println("passed");

		} else {

			System.out.println("failed");

		}

	}

}
