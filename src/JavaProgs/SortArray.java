package JavaProgs;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {3, 2, 6, 5, 23, 43, 1};
		
		getsortedarray(num);

	}

	public static void getsortedarray(int[] num) {

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {

					int tmp;
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		for(int k=0;k<num.length;k++)
		System.out.println(num[k]);
		
		System.out.println("smallest number in array is "+num[num.length-1]);
	}

}
