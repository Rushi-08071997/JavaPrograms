package JavaProgs;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c, d;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (c = 0; c <= n; c++) {
			int k = 1;
			for (d = n; d <= c; d--) {

				System.out.print("*" + " ");
			}
			System.out.print(" ");
		}

	}

}
