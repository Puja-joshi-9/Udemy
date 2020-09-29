package assignment5;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		double m = sc.nextDouble();
		System.out.print("Enter the number in power: ");
		double n = sc.nextDouble();

		long result = (long) Math.pow(m, n);

		System.out.println("The result is: " + result);

	}

}
