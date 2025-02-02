package JavaProgs;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(convertDecimalToBinary(21));
		

	}

	public static long convertDecimalToBinary(int num) {

		long binarynumber = 0;
		int remainder=1,i=1;
		

		while (num > 0) {
			remainder = num % 2;
			num=num/2;
			binarynumber += remainder * i;
			i *= 10;
		

		}

		return binarynumber;
	}

}
