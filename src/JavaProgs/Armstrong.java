package JavaProgs;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getarm(153);

	}

	public static void getarm(int num) {

		int cube = 0;
		int r = 0;
		int j;
		j = num;

		while (num>0) {

			r = num%10;
			num = num/10;
			cube = cube+(r*r*r);
		}
		
			if (cube == j) {
				System.out.println("passed");
				
			}else {
				
				System.out.println("failed");

		}
		
	}

}
