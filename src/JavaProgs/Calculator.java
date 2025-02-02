package JavaProgs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers");

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		System.out.println("Choose an operator:(+.-,*,/)");

		char operator = sc.next().charAt(0);

		double result = 0;

		switch (operator) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;

		default:
			System.out.println("Enter correct operator");

		}

		System.out.println(result);

	}

}
