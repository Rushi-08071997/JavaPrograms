package JavaProgs;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num = 10011011;
		int decimal = BinaryToDecimal.convertBinaryToDecimal(num);
		System.out.println(decimal);

	}

	public static int convertBinaryToDecimal(long num) {

		int decimalnumber = 0;
		int i = 0;
		double remainder;

		while (num > 0) {
			remainder = num % 10;
			num = num / 10;
			decimalnumber += remainder * Math.pow(2, i);
			i++;

		}

		return decimalnumber;
	}

}
