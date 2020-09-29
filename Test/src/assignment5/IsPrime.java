package assignment5;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {

		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number:");

		int a = sc.nextInt();

		for (int i = 2; i <= a / 2;) {

			if (a % i == 0) {
				count++;
			}
			break;
		}

		if (count == 0 && a != 1) {
			System.out.println(a + " is prime");
		} else {

			System.out.println(a + " is not prime.");
		}

	}
}
