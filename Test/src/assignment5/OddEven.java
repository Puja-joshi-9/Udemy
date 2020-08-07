package assignment5;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {

		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		a = sc.nextInt();

		if (a != 0) {
			if (a % 2 == 0) {
				System.out.println(a + " is an even number.");

			} else {
				System.out.println(a + " is an odd number.");
			}

		} else {
			System.out.println(a + " is neither odd nor even.");
		}
	}
}
